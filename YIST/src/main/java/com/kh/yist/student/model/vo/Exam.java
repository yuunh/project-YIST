package com.kh.yist.student.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Exam {

	private int testNo;
	private String id;
	private int subjectNo;
	private String testTitle;
	private String examDate;
	private int examTime;
	private String status;
	
	private String q1;
	private String q2;
	private String q3;
	private String q4;
	private String q5;
}
