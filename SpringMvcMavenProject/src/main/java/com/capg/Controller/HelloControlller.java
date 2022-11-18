package com.capg.Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.Model.Student;

@Controller
public class HelloControlller {
	@RequestMapping("/home")
	public String display(@RequestParam("name") String name,@RequestParam("pass")String pass, Model m)
	{
		Student student=new Student();
		student.setName(name);
		student.setPass( pass);
	//		if(pass.equals("admin"))
//		{
//			String msg = "Hello " + name;
			m.addAttribute("message",student);
			return "viewpage";
//		}
//		else
//		{
//			String msg="Sorry " + name + ".You entered an incorrect password";
//			m.addAttribute("message", msg);
//			return "errorpage";
//		}
		
	}
	

}
