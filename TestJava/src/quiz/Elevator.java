package quiz;

import java.util.Scanner;

public class Elevator {//답은 ElevatorService를 보면된다.
	/*  [87.5/100점]
	 *  1) 불필요한 예외 처리가 존재합니다.(수정완료)
	 *  2) 탑승 시 벗어난 층을 입력하여도 정상적으로 들어가며(ex)5층 - (수정안함)
	 *  2-1)이에 따라 해당 위치는 도착할 수 있는
	 *  층이 없기에 탑승 불가 상태가 영구적으로 유지됩니다.(ex) (2)에 내용과 연결되며 내리지 못하므로 계속 자리를 차지한다.
	 */
	int[] floor = {1,2,3};//3층
	int now = 0;
	int[] elevator = {-1,-1,-1,-1};
	String[] location = {"왼쪽","오른쪽","앞","뒤"};
	
	int pos = -1;
	Scanner sc = new Scanner(System.in);
	/*
	 * 주제 : 엘리베이터 구현
	 * 
	 * - 조건 -
	 * 
	 * 엘리베이터는 4명이 탑승이 가능하며, 총 3개 층으로 이루어져있음.
	 * 
	 * 탑승객은 목표 층을 입력하여 해당 층이 되면, 자동으로 내리게 구현.
	 * 
	 * 엘리베이터는 무조건 올라갔다가 내려가는 형태로 이동.
	 */
	public static void main(String[] args) {
		Elevator et = new Elevator();
		et.run();
	}

	private void run() {
		boolean tf = true;
		
		while(tf) {
			System.out.println("--------------------------");
			System.out.println("👮‍♀️ 띵동! " + floor[now] +"층 입니다." );
			System.out.println("--------------------------");
			System.out.println("1.탑승 2.이동 9.종료");
			System.out.print("입력>> ");
			switch (sc.nextLine()) {
			case "1":
				join();
				break;
			case "2":
				move();
				break;
			case "9":
				tf = false;//while문 종료
				System.out.println("엘레베이터 운행 종료");
				break;
				
			default:
				System.out.println("잘못입력했습니다. 다시 입력해주세요.");
				//break가 없는 이유는 다시 while문 실행하기 위해서 
			}
		}
		
	}

	private void join() {
		// 엘레베이터 타는 메소드
		int imp = 0;
		
		System.out.println("엘리베이터 현황");
		//입력받기 전
		
		for(int i=0; i<elevator.length; i++) {
			System.out.print((i+1)+". "+location[i]+" 자리 : ");
			if(elevator[i] == -1) {
				System.out.print("가능  ");
			}else {
				System.out.print("불가능  ");
				imp++;//출력할 때 불가능 개수를 세어서 아래줄 if문을 실행함
			}
		}
		
		System.out.println();
		
		//입력받기
		if(imp == elevator.length) {
			//4=4
			System.out.println("엘레베이터가 꽉 찼습니다!! 다음 엘레베이터 타세요!");
			
		}else {
			System.out.println("\n선택하세요.");
			
			for(int i=0; i< elevator.length; i++) {
				if(elevator[i] == -1) {
					System.out.println((i+1)+". "+location[i]);
				}else {
					System.out.println((i+1)+"."+"❌");
				}
			}
		}
		
		try {
			System.out.print("입력>> ");
			int e = Integer.parseInt(sc.nextLine())-1;
			
			if(elevator[e] > -1) {
				System.out.println("선택하신 자리에는 사람이 있습니다.\n다음에 이용해주세요.\n");
				return;
			}
			
			if(elevator[e] == -1) {
				System.out.println("\n층 수를 선택해주세요.");
				for(int i=0; i<floor.length; i++) {
					if(now != i) {
						//현재 층수는 출력불가!
						System.out.print((i+1)+"."+floor[i]+"층 ");
					}else {
						System.out.print((i+1)+".❌ ");
					}
				}
			}
			System.out.println();
			
				System.out.print("입력>> ");
				int f = Integer.parseInt(sc.nextLine())-1;
				
				if(f == now) {
					//현재 층은 선택불가!!
					System.out.println("현재 층은 선택 불가입니다.");
				}else {
					elevator[e] = f;//승객이 층을 입력했다!
				}
			
			
		}catch (Exception e) {
			System.out.println("없는 엘레베이터를 선택했군요!!");
		}
	}

	private void move() {
		if(now == floor.length -1 || now ==0 ) {
			pos *= -1;
			//현재 pos = -1 * -1
			//역으로 돌면 현재 pos = 1 * -1
		}
		
		now+=pos;
		
		int cnt = 0; //현재 층에서 태리는 elevator탑승객 총 수
		
		for(int i=0; i<elevator.length; i++) {
			if(elevator[i] == now) {
				//현재 층과 탑승자가 누른 층이 같다면
				elevator[i] = -1;
				cnt++;
			}
		}
		
		//출력
		if(cnt > 0) {
			//2명이 하차하엿습니다.
			System.out.println("🔊"+cnt+"명 내렸습니다.");
		}
		
		if(pos == 1) {
			System.out.println("👮‍♀️👮 올라갑니다‍!!!");
		}else {
			//-1
			System.out.println("👮‍♀️👮 내려갑니다!!");
		}

}
}