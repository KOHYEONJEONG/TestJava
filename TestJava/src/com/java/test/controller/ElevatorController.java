package com.java.test.controller;

import com.java.test.service.ElevatorService;

public class ElevatorController {
	//22-06-30일날 엘레베이터 쪽지시험
	//SubwayController 참고
	public static void main(String[] args) {

		ElevatorService ev = new ElevatorService();

		ev.run();
	}
}