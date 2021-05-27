package org.mishra.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public List<String> getGender() {
		List<String> gender=new ArrayList<>();
		gender.add("Male");
		gender.add("Female");
		return gender;
	}

	@Override
	public List<String> getCourses() {
		List<String> courses=new ArrayList<>();
		courses.add("Java");
		courses.add("Python");
		courses.add("Full Stack");
		courses.add("Hadoop");
		return courses;
	}

	@Override
	public List<String> getTimings() {
		List<String> timings=new ArrayList<>();
		timings.add("Morning");
		timings.add("Afternoon");
		timings.add("Evening");
		return timings;
	}

}
