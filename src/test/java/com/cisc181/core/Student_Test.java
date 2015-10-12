package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	ArrayList<Course> courses = new ArrayList<Course>();
	ArrayList<Semester> semesters = new ArrayList<Semester>();
	ArrayList<Section> sections = new ArrayList<Section>();
	ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Enrollment> enrolls = new ArrayList<Enrollment>();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Course CISC181 = new Course();
		Course GEOL105 = new Course();
		Course MATH242 = new Course();

		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(CISC181);
		courses.add(GEOL105);
		courses.add(MATH242);

		Semester fall = new Semester();
		Semester spring = new Semester();

		ArrayList<Semester> semesters = new ArrayList<Semester>();
		semesters.add(fall);
		semesters.add(spring);

		Section sec1 = new Section();
		Section sec2 = new Section();
		Section sec3 = new Section();
		Section sec4 = new Section();
		Section sec5 = new Section();
		Section sec6 = new Section();

		ArrayList<Section> sections = new ArrayList<Section>();
		sections.add(sec1);
		sections.add(sec2);
		sections.add(sec2);
		sections.add(sec3);
		sections.add(sec4);
		sections.add(sec5);
		sections.add(sec6);

		Student stu1 = new Student(eMajor.CHEM);
		Student stu2 = new Student(eMajor.NURSING);
		Student stu3 = new Student(eMajor.BUSINESS);
		Student stu4 = new Student(eMajor.PHYSICS);
		Student stu5 = new Student(eMajor.ART);
		Student stu6 = new Student(eMajor.COMPSI);
		Student stu7 = new Student(eMajor.COMPSI);
		Student stu8 = new Student(eMajor.BIOLOGY);
		Student stu9 = new Student(eMajor.NURSING);
		Student stu10 = new Student(eMajor.BUSINESS);

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		students.add(stu4);
		students.add(stu5);
		students.add(stu6);
		students.add(stu7);
		students.add(stu8);
		students.add(stu9);
		students.add(stu10);

		

	}

	@Test
	public void StudentTest() {
		// Major changer
		Student changemajor = new Student(eMajor.BIOLOGY);
		changemajor.setMajor(eMajor.ART);
		assertTrue(changemajor.getMajor() == eMajor.ART);

		// My attempt at enrolling and calculating an average....
	
		for (int i = 0; i > students.size(); i++) {
			for (int j = 0; j < sections.size(); j++) {
				Enrollment enroll = new Enrollment(UUID.randomUUID(), UUID.randomUUID());
				enrolls.add(enroll);
			}
			double sum = 0;
			double average = 0;
			// sets all people enrolled with grade 90
			for (Enrollment e : enrolls) {
				e.setGrade(90.00);
			}

			for (Enrollment e : enrolls) {
				sum += e.getGrade();
				average = sum / 5;
			}
			assertEquals((90 * 60 / 60), average, 0);
		}

	}

}
