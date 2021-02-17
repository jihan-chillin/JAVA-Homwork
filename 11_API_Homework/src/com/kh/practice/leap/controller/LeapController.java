package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.Date;

public class LeapController {
	
	// 윤년이면 true
	// 평년 false
	public boolean isLeapYear(int year) {
		if((year%4 == 0) && ((year%100 != 0)||(year%400 == 0))) {
			return true;
		}
		else return false;
	}
	
	public long leapDate(Calendar c) {
		Date today = new Date();
		
		int year = 1;
		int presentYear = c.get(Calendar.YEAR);
		int totalDays = (presentYear - 1)*365;
		
		// Calendar 객체 생성.
		Calendar cal = Calendar.getInstance ( );
        Calendar cal2 = Calendar.getInstance ( );

        cal.setTime ( today );
        // 오늘 날짜로 만듦.
        cal2.set ( presentYear, Calendar.JANUARY, 1 );
        // 현재 연도 1월1일으로 만듦.

        int count = 0;
        // 일수 증가시키기 위함
        while ( !cal2.after ( cal ) ) {
            // cal이 cal2보다 이후가 아닌동안 반복.
            count++;
            // 일수 증가.
            cal2.add ( Calendar.DATE, 1 );
            // 현재연도 1월 1일부터 1일 뒤 날짜로 바뀜.
        }

        int totalCount = count+totalDays;
        
        return (long)totalCount;
	
	}

	
}
