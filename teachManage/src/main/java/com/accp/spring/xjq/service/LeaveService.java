package com.accp.spring.xjq.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.accp.spring.pojo.LeaveProcessTrack;
import com.accp.spring.pojo.Teacher;
import com.accp.spring.xjq.mapper.LeaveMapper;
import com.accp.spring.xjq.pojo.LeaveDomeNodeVo;
import com.accp.spring.xjq.pojo.LeaveProcessTrackVo;
import com.accp.spring.xjq.pojo.LeaveProcessVo;
import com.accp.spring.xjq.pojo.RegisterLeaveVo;

@Service
public class LeaveService {
	
	@Autowired
	private LeaveMapper leaveMapper;
	
	
	@Transactional
	public List<LeaveProcessVo> selectProcessWithMe(){
		int teaId = 1;
		List<LeaveProcessVo> leaveList = this.leaveMapper.selectAllLeaveProcess();
		List<LeaveProcessVo> myLeaveList = new ArrayList<LeaveProcessVo>();
		for (LeaveProcessVo leave : leaveList) {
			int a = 1;
			List<LeaveProcessTrackVo> tracks = this.leaveMapper.selectTrackByleaveId(leave.getLeaveId());
			leave.setTracks(tracks);
			for (LeaveProcessTrackVo t : tracks) {
				//判断前一节点是否通过
					if(t.getDealResult() == 1){
						//通过了
						a++;
						if(t.getHandler()==teaId) { //判断该请假的节点是否有我的Id
							myLeaveList.add(leave);
						}
					}else if(t.getDealResult() == 2) {
						//拒绝了
						//return null;
					}else if(t.getDealResult() == 0){
						// 未做判断
						if(t.getHandler()==teaId && a==t.getNode()) { //判断该请假的节点是否有我的Id
							myLeaveList.add(leave);
						}
					}
			}
			
		}
		return myLeaveList;
	}
	
	
	
	@Transactional
	public LeaveProcessVo selectProcessByleaveId(int leaveId){
		LeaveProcessVo leave = this.leaveMapper.selectLeaveByid(leaveId);
			leave.setTracks(this.leaveMapper.selectTrackByleaveId(leaveId));
		return leave;
	}
	
	
	public List<LeaveProcessTrackVo> selectLeaveTrackByleaveId(int leaveId){
		return this.leaveMapper.selectTrackByleaveId(leaveId);
	}
	
	
	
	/**
	 * 修改请假跟踪处理结果
	 * @param track
	 * @return
	 */
	@Transactional
	public int updLeaveTrack(LeaveProcessTrack track) {
		int teaId = 1;
		List<LeaveProcessTrackVo> tracks = this.leaveMapper.selectTrackByleaveId(track.getLeaveId());
		int i = 0;
		int a = 0;
		for (LeaveProcessTrackVo tr : tracks) {
			if(tr.getDealResult()==0) {
				i++;
			}else if(tr.getDealResult()==1) {
				a++;//已通过
			}
		}
		if(i == tracks.size()) {
		
		}
		if(a == tracks.size()) {
			//全部已通过 ,修改请假实例的状态  改为已通过
			this.leaveMapper.updLeaveProcess(3, track.getLeaveId());
			//判断是否需要同步的寝室,如果需要同步,直接新增不住寝记录
			LeaveProcessVo leave = this.leaveMapper.selectLeaveByid(track.getLeaveId());
			if(leave.getIsDorm() == 2) {
				//同步
				RegisterLeaveVo leaveVo = new RegisterLeaveVo();
				leaveVo.setStuId(leave.getStuId());
				leaveVo.setStartTime(leave.getLeaStartTime());
				leaveVo.setEndTime(leave.getLeaEndTime());
				leaveVo.setWriteTime(leave.getLeaTime());
				leaveVo.setDormMangeId(teaId);
				this.leaveMapper.insertDormLeave(leaveVo);
			}
			
		}
		if(track.getDealResult() == 2) {
			//我选择拒绝了,,改为一拒绝
			this.leaveMapper.updLeaveProcess(4, track.getLeaveId());
		}
		return this.leaveMapper.updLeaveTrack(track);
	}
	
	

	/*List<LeaveProcessTrack> tracks = new ArrayList<LeaveProcessTrack>();
	List<LeaveDomeNodeVo> nodes = this.leaveMapper.selectAllNodeByDomeId(leave.getLeaveId());
	for (LeaveDomeNodeVo node : nodes) {
		Teacher tea = this.leaveMapper.selectTeaByType(leave.getLeaveId(), node.getHandler());
		LeaveProcessTrack track = new LeaveProcessTrack();
		track.setLeaveId(leave.getLeaveId());
		track.setNodeId(node.getNodeId());
		if(tea == null) {
			track.setHandler(13);
		}else {
			track.setHandler(tea.getTeaId());
			
			if(tea.getTeaId()==1) {
				a=1; //如果这条请假实例包含了我的教员id
			}
		}
		//this.leaveMapper.insertLeaveTrack(track);
		tracks.add(track);
	}*/
	//myLeaveList.add(leave); 
}
