package org.mishra.controller;

import org.apache.tomcat.jni.User;
import org.mishra.model.Student;
import org.mishra.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	private StudentService service;
	public StudentController(StudentService service) {
		this.service=service;
	}
	@ModelAttribute
	public void loadFormData(Model model)
	{
		model.addAttribute("student", new Student());
		model.addAttribute("gender", this.service.getGender());
		model.addAttribute("courses", this.service.getCourses());
		model.addAttribute("timings", this.service.getTimings());
	}
	@RequestMapping(value = {"/","/loadForm"},method = RequestMethod.GET)
	public String loadForm()
	{
		return "index";
	}
	@RequestMapping(value="/submit",method = RequestMethod.POST)
	public String handleSubmit(Student student,Model model)
	{
		System.out.println("Student :: "+student);
		if(student!=null)
		{
			model.addAttribute("msg", "Student Added Succesfully");
		}
		return "index";
	}
}
