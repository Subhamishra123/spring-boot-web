package org.mishra.model;

import lombok.Data;

@Data
public class Student {
	private String studentName;
	private String studentMail;
	private String gender;
	private String course;
	private String[] timings;
}
