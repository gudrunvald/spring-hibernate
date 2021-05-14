package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {

		Coach theCoach = new BaseballCoach();
		System.out.println(theCoach.getDailyWorkout());
		
		Coach theCoach2 = new TrackCoach();
		System.out.println(theCoach2.getDailyWorkout());
		
		Coach theCoach3 = new BasketballCoach();
		System.out.println(theCoach3.getDailyWorkout());
	}
}
