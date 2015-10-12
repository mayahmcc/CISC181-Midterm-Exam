package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@Test
	public void Averagetest() {

		Staff frank = new Staff(eTitle.ENGINEER);
		Staff chris = new Staff(eTitle.ENGINEER);
		Staff mayah = new Staff(eTitle.ENGINEER);
		Staff chihiro = new Staff(eTitle.ENGINEER);
		Staff aria = new Staff(eTitle.ENGINEER);

		frank.setSalary(100000.00);
		chris.setSalary(200000.00);
		mayah.setSalary(300000.00);
		chihiro.setSalary(200000.00);
		aria.setSalary(150000.00);

		ArrayList<Staff> staff = new ArrayList<Staff>();

		staff.add(frank);
		staff.add(chris);
		staff.add(mayah);
		staff.add(chihiro);
		staff.add(aria);

		assertTrue(staff.size() == 5);

		double sum = 0;
		double average = 0;

		for (Staff s : staff) {
			sum += s.getSalary();
			average = sum / staff.size();
		}
		assertEquals(950000.00, sum, 0);
		assertEquals(190000.00, average, 0);
	}

	@Test(expected = PersonException.class)
	public final void testDOB() throws PersonException {
		
		// Invalid birth date
		Calendar cal = Calendar.getInstance();
		cal.set(1914, Calendar.OCTOBER, 11);
		Date invalid = cal.getTime();

		Staff invalidguy = new Staff(eTitle.DENTIST);

		invalidguy.setDOB(invalid);
	
		invalidguy.getDOB();
	
	}
	@Test(expected = PersonException.class)
	public final void testPhone() throws PersonException{
		
		Staff badphone = new Staff(eTitle.DENTIST);
		badphone.setPhone("302-98-87-75");
		badphone.getPhone();
	}
	
}