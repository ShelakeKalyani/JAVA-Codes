/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to create a package name student. Define class StudentInfo with method to display 
information about student such as rollno, class, and percentage. Create another class StudentPer with 
method to find percentage of the student. Accept student details like rollno, name, class and
marks of 6 subject from user.
Developed Date  : 01-01-2023 
Technology Used : JAVA (Interface)
*/

import student.*;
import java.util.*;

class stud 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int rollno,m1,m2,m3,m4,m5,m6;
		String name,class1;
		double per;
		
		System.out.println("Enter student roll number = ");
		rollno = sc.nextInt();
		System.out.println("Enter student name = ");
		name = sc.next();
		System.out.println("Enter student class = ");
		class1 = sc.next();
		System.out.println("Enter marks of 6 subject = ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
		m6 = sc.nextInt();
		
		StudentPer obj = new StudentPer();
		per = obj.calPer(m1,m2,m3,m4,m5,m6);
		//System.out.println("Student Percentage = "+per);
		
		StudentInfo obj2 = new StudentInfo(rollno,name,class1,per);
		obj2.Display();
	}
}