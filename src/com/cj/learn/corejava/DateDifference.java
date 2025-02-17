package com.cj.learn.corejava;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DateDifference {

	public static void main(String[] args) 
	{
		LocalDate ld = LocalDate.of(2020, 01, 01);
		
		LocalDate ld1 = LocalDate.of(2024, 10, 02);
		
		Period p = Period.between(ld1, LocalDate.now());
		
		System.out.println(p);
		
		System.out.println("Difference is:" + p.getYears() + "years " + p.getMonths() + "Months " + p.getDays() + "Days ");
		
		LocalTime lt = LocalTime.of(2, 05, 52);
		
		Duration d = Duration.between(lt, LocalTime.now());
		
		System.out.println(d);
	}

}
