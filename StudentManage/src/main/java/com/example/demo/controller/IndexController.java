package com.example.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.util.AuthService;
import com.accp.springmvc.util.FaceDetect;
import com.accp.springmvc.util.FaceMatchs;
import com.example.demo.pojo.Punchcardrecord;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.newsStudent;
import com.example.demo.service.Faceservice;

@Controller
@CrossOrigin
public class IndexController {
   
	public static final String APPID = "14953378";
	//�ٶ�����ʶ��Ӧ��apikey
	public static final String API_KEY = "E0NT6Ffi3YMtqFVeGnHDtHWg";
	//�ٶ�����ʶ��Ӧ��sercetkey
	public static final String SERCET_KEY = "OAOm42Tds8nIIoGq0IuXNBhdFqMdDsWz";

	public static final String API_URL = "https://aip.baidubce.com/rest/2.0/face/v3/match";

	@Autowired
	private Faceservice fv;
	
	@RequestMapping(value="/index")
	public String index() {
		return "/NewFace.jsp";
	}

	@ResponseBody
	@RequestMapping(value="/newface",method=RequestMethod.POST)
	public String newface(String face) {
		  String token=  AuthService.getAuth(API_KEY,SERCET_KEY);
		//  String faceadd=  FaceAdd.add(face, token);
	
		  String facedate= FaceDetect.detect(face, token);		
		return facedate;
	}
	@ResponseBody
	@RequestMapping(value="/insertfase",method=RequestMethod.POST)
	public Object insertface(String face,HttpSession session,HttpServletRequest req,HttpServletResponse resp){
	
		double score=0;
	List<newsStudent> fs=	this.fv.selectface();
	 for (newsStudent ns : fs) {
		String textface =ns.getFace();
	    int name =ns.getStuid();
	    String nam=name+"";
	    String token=  AuthService.getAuth(API_KEY,SERCET_KEY);
	    score+=  FaceMatchs.match(face, token, textface, nam);

	}
	 String name=FaceMatchs.names;
	 Student stu=new Student();
	  stu=this.fv.selectadmin(Integer.parseInt(name));
	  stu.setScore(score);
	  System.out.println(stu.getScore()+"相似度");
	 Map<Object, Object> map = new HashMap<Object, Object>();
	 map.put("name", name);
	 map.put("score", score);
	/* List<String> ns=new ArrayList<String>();
	      ns.add(score);
	      ns.add(name);*/
	       return stu;
	}
	@ResponseBody
	@RequestMapping(value="/insertpd",method=RequestMethod.GET)
	public Object  selectstuname(String stuname,int stuId) {
		
		Student student =this.fv.selecestunamid(stuname);
		int stuid=student.getStuid();
		Punchcardrecord pd=new Punchcardrecord();
		pd.setStuId(stuid);
		pd.setPunchTime(new Date());
		pd.setRecordPerson(stuId);
		return this.fv.insertpunchCardRecord(pd);
	}
}