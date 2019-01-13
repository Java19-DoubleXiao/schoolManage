package com.accp.spring.xjq.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.pojo.Classes;
import com.accp.spring.pojo.PunchCardSetting;
import com.accp.spring.pojo.Student;
import com.accp.spring.xjq.mapper.ClassesMapper;
import com.accp.spring.xjq.pojo.ClassInfo;
import com.accp.spring.xjq.pojo.ClassStudent;


@Service
public class ClassesService {

	@Autowired
	private ClassesMapper classesMapper;
	
	
	@Transactional
	public List<ClassInfo> selectMyClass(int userId){
		 List<ClassInfo> classInfo = this.classesMapper.selectMyClass(userId);
		 for (ClassInfo ci : classInfo) {
			ci.setStudents(this.classesMapper.selectMyStudentByClassId(ci.getClassId()));
		}
		return classInfo;
	}
	
	
	
	public int selectClassId(String cName) {
		Classes c = this.classesMapper.selectClassIdByCName(cName);
		if(c == null) {
			return 0;
		}else {
			return c.getClassId();
		}
	}

	public List<Student> selectStuByClassId(int classId){
		if(classId==0) {
			return null;
		}
		return this.classesMapper.selectStuByClassId(classId);
	}
}
