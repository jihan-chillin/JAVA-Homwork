package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.Date;

public class LeapController {
	
	// �����̸� true
	// ��� false
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
		
		// Calendar ��ü ����.
		Calendar cal = Calendar.getInstance ( );
        Calendar cal2 = Calendar.getInstance ( );

        cal.setTime ( today );
        // ���� ��¥�� ����.
        cal2.set ( presentYear, Calendar.JANUARY, 1 );
        // ���� ���� 1��1������ ����.

        int count = 0;
        // �ϼ� ������Ű�� ����
        while ( !cal2.after ( cal ) ) {
            // cal�� cal2���� ���İ� �ƴѵ��� �ݺ�.
            count++;
            // �ϼ� ����.
            cal2.add ( Calendar.DATE, 1 );
            // ���翬�� 1�� 1�Ϻ��� 1�� �� ��¥�� �ٲ�.
        }

        int totalCount = count+totalDays;
        
        return (long)totalCount;
	
	}

	
}
