package com.java.test.service;

import java.util.Scanner;

public class ElevatorService {// 강사님 엘레베이터 ( SubwayController에서 실행 )
	Scanner sc = new Scanner(System.in);

	// 층정보
	String[] stair = { "1층", "2층", "3층" };

	// 현재 위치
	int now = 0;

	// 탑승 현황
	int[] ev = { -1, -1, -1, -1 };

	// 방향 지정
	int pos = -1;

	public void run() {

		boolean r = true;

		while (r) {

			System.out.println("=================================");

			System.out.println("현재층은 " + stair[now] + "입니다.");

			System.out.println("=================================");

			System.out.println("메뉴를 선택하세요.");

			System.out.println("1.탑승 2.상세보기 3.이동 9.종료");

			switch (sc.nextLine()) {

			case "1":
				join();
				break;

			case "2":
				status();
				break;

			case "3":
				move();
				break;

			case "9":
				r = false;
				System.out.println("엘리베이터를 종료합니다.");
				break;

			default:
				System.out.println("잘못입력하였습니다.");
			}
		}
	}

	public void join() {

		int imp = 0;

		System.out.println("---- 탑승가능 현황 ----");

		for (int i = 0; i < ev.length; i++) {
			System.out.print((i + 1) + "번 자리 : ");

			if (ev[i] == -1) {
				System.out.println("가능");

			} else {
				System.out.println("불가능");
				imp++;

			}

		}

		if (imp == ev.length) {
			System.out.println("자리가 없습니다.");

		} else {
			System.out.println("어느 자리에 위치하시겠습니까?");

			for (int i = 0; i < ev.length; i++) {

				if (ev[i] == -1) {
					System.out.print((i + 1) + "." + (i + 1) + "번 ");

				}

			}

			System.out.println();

			try {

				String input = sc.nextLine();

				int t = Integer.parseInt(input) - 1;

				if (ev[t] == -1) {

					System.out.println("층을 선택해 주세요.");

					for (int i = 0; i < stair.length; i++) {

						if (now != i) {

							System.out.print((i + 1) + "." + stair[i] + " ");

						}

					}

					System.out.println();

					String input2 = sc.nextLine();

					int s = Integer.parseInt(input2) - 1;

					if (s == now) {
						System.out.println("목적지로 현재층은 안됩니다.");
					} else if (s >= stair.length) { //지하철 문제에 없는부분
						System.out.println("없는 층입니다."); //지하철 문제에 없는부분
					} else {
						ev[t] = s;
					}
				} else {
					System.out.println("탑승이 불가능합니다.");
				}

			} catch (Exception e) {

				System.out.println("잘못입력하였습니다.");

			}

		}

	}

	public void status() {
		System.out.println("---- 엘리베이터 현황 ----");

		for (int i = 0; i < ev.length; i++) {
			System.out.print((i + 1) + "번 자리 : ");

			if (ev[i] > -1) {
				System.out.print("[" + stair[ev[i]] + "]");
			}
			System.out.println();
		}

	}

	public void move() {
		if (now == stair.length - 1 || now == 0) {
			pos *= -1;
		}
		now += pos;
		int cnt = 0;

		for (int i = 0; i < ev.length; i++) {
			if (ev[i] == now) {
				ev[i] = -1;
				cnt++;
			}
		}

		if (cnt > 0) {
			System.out.println(cnt + "명이 내렸습니다.");

		}

	}

}