package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	LeapController lc = new LeapController();
	Calendar c = Calendar.getInstance();
	
	public LeapView() {
		System.out.println(lc.isLeapYear(2021));
		System.out.println(lc.leapDate(c));
		
	}

}
