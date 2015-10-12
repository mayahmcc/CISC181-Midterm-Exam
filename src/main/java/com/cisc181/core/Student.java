package com.cisc181.core;

import java.util.ArrayList;
import java.util.Date;

import com.cisc181.eNums.eMajor;

public class Student extends Person {

	private eMajor Major;

	public eMajor getMajor() {
		return this.Major;
	}

	public void setMajor(eMajor major) {
		this.Major = major;
	}
	// self made student constructor so it will be easier to create 10 student
	// records.
	// (like staff)

	public Student(eMajor Major) {
		this.Major = Major;
	}

	public Student(String FirstName, String MiddleName, String LastName, Date DOB, eMajor Major, String Address,
			String Phone_number, String Email) {
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.Major = Major;

	}

	@Override
	public void PrintName() {
		System.out.println(getLastName() + "," + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal) {
		super.PrintName();
	}

	public int CalculateGPA() {
		int sum = 0;
		int average = 0;
		ArrayList<Integer> grades = new ArrayList<Integer>();
		for (Integer value : grades) {
			sum += value.intValue();
			average = sum / grades.size();
		}
		return average;
	}

}