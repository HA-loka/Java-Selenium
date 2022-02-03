package com.ha.task4;

public class StudentTest {

	public static void main(String[] args) {
		//Student object creation
		Student st1=new Student();
		Student st2=new Student();
		Student st3=new Student();
		
		st1.setStudentName("John");
		st2.setStudentName("peter");
		st3.setStudentName("Mark");
		
		st1.setStudentMailId("John@gmail.com");
		st2.setStudentMailId("peter@gmail.com");
		st3.setStudentMailId("mark@gmail.com");
		
		st1.setStudentPercentage(78.2);
		st2.setStudentPercentage(70.2);
		st3.setStudentPercentage(61.2);
		
		System.out.println("Student 1");
		System.out.println(st1.getStudentRollno());
		System.out.println(st1.getStudentName());
		System.out.println(st1.getStudentMailId());
		System.out.println(st1.getStudentPercentage());
		System.out.println(st1.getSchoolName());
		System.out.println("-----------------------------------------");
		System.out.println("Student 2");
		System.out.println(st2.getStudentRollno());
		System.out.println(st2.getStudentName());
		System.out.println(st2.getStudentMailId());
		System.out.println(st2.getStudentPercentage());
		System.out.println(st2.getSchoolName());
		System.out.println("-----------------------------------------");
		System.out.println("Student 2");
		System.out.println(st3.getStudentRollno());
		System.out.println(st3.getStudentName());
		System.out.println(st3.getStudentMailId());
		System.out.println(st3.getStudentPercentage());
		System.out.println(st3.getSchoolName());
		System.out.println("-----------------------------------------");
	}

}
