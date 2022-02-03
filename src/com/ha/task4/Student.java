package com.ha.task4;

import java.util.regex.Pattern;

public class Student {
	private int count=1000;
	private int studentRollno;
	


	private String studentName;
	private String studentMailId;
	private double studentPercentage;
	
	private static String schoolName;
	
	
	//Student constructor to assign School name and Student ROllnumber
	Student(){
		this.studentRollno=count+1;
		count=count+1;
		schoolName="New York City High";
	}


	public int getStudentRollno() {
		return studentRollno;
	}

	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentMailId() {
		return studentMailId;
	}


	public void setStudentMailId(String studentMailId) {
		
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
                  
		Pattern pat = Pattern.compile(emailRegex);
		if(pat.matcher(studentMailId).matches()) {
		this.studentMailId = studentMailId;}
		else {
			System.out.println("Inavlid mail ID");
		}
	}


	public double getStudentPercentage() {
		return studentPercentage;
	}


	public void setStudentPercentage(double studentPercentage) {
		
		if(studentPercentage>=0 && studentPercentage<=100) {
		this.studentPercentage = studentPercentage;}
		else {
			System.out.println("Inavlid Percentage");
		}
		
	}


	public String getSchoolName() {
		return schoolName;
	}
}
