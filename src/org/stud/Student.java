package org.stud;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter id: ");
		int id = s.nextInt();
		System.out.println("enter name: ");
		String name = s.next();
		System.out.println("enter email: ");
		String email = s.next();
		System.out.println("enter phno: ");
		long phno = s.nextLong();
		System.out.println("enter dept: ");
		String dept = s.next();
		System.out.println("enter gender: ");
		char ch = s.next().charAt(0);
		
		
		System.out.println("Student ID: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("Student Email: "+email);
		System.out.println("Student Phoneno: "+phno);
		System.out.println("Student Dept: "+dept);
		System.out.println("Student Gender: "+ch);
			}

}
