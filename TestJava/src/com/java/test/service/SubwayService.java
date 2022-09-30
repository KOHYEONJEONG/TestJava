package com.java.test.service;
import java.util.Scanner;

public class SubwayService {//내가 푼 풀이
	public Scanner sc = new Scanner(System.in);
	String[] station = {"장승백이","연신내","강남","양재","평택"};
	int[][] customer = {{-1},{-1},{-1},{-1}};//1차원:n호차 , 2차원:목적지 인덱스
	
	int pos = -1;//-1 또는 1
	int now = 0;//현재위치(now+pos)
	
	int count = 0;//열차 만석이면 안되게
	
	public void run() {
		
		boolean runFlag = true;
		
		System.out.println("------------------------");
		System.out.println("WELECOM TO THE SubWay");
		System.out.println("------------------------");
		
		while(runFlag) {
			
			System.out.println("👮‍♀️현재역은 "+station[now]+ "입니다.👮‍♀️");
			System.out.println("===============================");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.탑승   2.상세보기   3.이동   9.종료");
			switch (sc.nextLine()) {
			case "1":
				train();//호선출력
				//탑승 시 목적지 지정. 목적지 도착 시 자동하차.
				break;
				
			case "2":
				status();
				break;           //switch문 종료
				
			case "3": //이동은 내가 눌러주는거임,이동시 1개역씩 이동
				      //이동을 어떻게 할건지, 목적지 도착시 내리기, 하차 한 사람 반영해 빈자리 변경
				move();
				break;           //switch문 종료
				
			case "9":
				System.out.println("운행을 종료합니다.\n");
				runFlag = false; //while문 종료
				break;           //switch문 종료
				
			default:
				System.out.println("※잘못 입력하셨습니다.※\n");
				
			}
		}
	}

	private void subwayStationPrint() {
		System.out.println("--------목적지는 어디입니까?--------");
		for(int i=0; i<station.length; i++) {
			if(station[i].equals(station[now])) {
				continue;
			}else {
				System.out.print((i+1)+". "+station[i]+" ");
			}
		}
		System.out.println();
		
	}

	//현재상태
	public void status() {
		System.out.println("=========현재상태=========");
		for(int i=0; i<customer.length; i++) {
			if(customer[i][0] == -1) {
				System.out.println((1+i)+"호차 : "+"가능");
			}else {
				System.out.println((1+i)+"호차 : "+"불가능 [" + station[customer[i][0]] + "]");
			}
		}
		System.out.println("count : "+ count);
	}

	//3번 누를때 이동
	public void move() {
		//첫시작은 0 인덱스임(now)
		
		//이동을 누르면 다음칸으로 이동한거겠지? 그래서 move()를 실행하면 now는 1부터시작함. 
		
		if(now >= customer.length) {
			//평택에 닿을때 돌왔을 때 양재방향으로 역으로 돌려고
			pos= pos*-1;//-1
		}else if(now==0) {
			//평택 전까지는 계속 1
			pos= pos*-1;
		}
		
		now+=pos; //4+-1 = 3 , 3+1 = 4
		
		System.out.println("현재 역 : "+now);
		System.out.println("pos : "+pos);
		
		//역은 계속 똑같이 돌면됨. now로 가리키는거임
		for(int i=0; i<customer.length;i++) {
			for(int j=0; j<customer[i].length;j++) {
				if(customer[i][0]==now) {
					System.out.println("🔊"+(i+1)+"호선 고객님 => "+station[now]+"역에서 하차하세요");
					customer[i][0] = -1;//내렷음
					count--;
				}
			}
		}
	}
	
	//목적지(역)와 호선 선택
	public void subwayStation(int train, int sIndex) {
		//현재역은 보여지면 안된다.
		
		//String[] station = {"장승백이","연신내","강남","양재","평택"};
		if(sIndex-1 == now || sIndex - 1 >= station.length) {//station.length : 가변적으로
			System.out.println("현재 역에서는 탑승못합니다.");
			return;
		}
		
		if(customer[train-1][0]>-1 || train-1>=customer.length) {//customer.length : 가변적으로
			System.out.println("해당 열차는 만석입니다.");
			return;
		}
		
		customer[train-1][0] = sIndex-1;
		String s = station[sIndex-1];
		count++;
		System.out.printf("--------%s목적지 & %d호선 선택--------",s,(train));
	}

	//n호차 출력
	public void train() {
		if(count==4) {
			System.out.println("전체 만석입니다.");
			return;
		}
		//전체 만석 처리도 해줘야 함.

		System.out.println("--------어느 열차에 탑승하시겠습니까?--------");
		for(int i=0; i<customer.length; i++) {
			if(customer[i][0] == -1) {
				System.out.print((1+i)+"."+(1+i)+"호차\t");
				
			}else {
				continue;
			}
		}
		
		System.out.println();
		System.out.print("> 입력 : ");
		int train = sc.nextInt();
		//trainSelect(param);//호선 선택
		
		subwayStationPrint();//역출력
		System.out.print("> 입력 : ");
		int station = sc.nextInt();
		subwayStation(train, station);//호선, 역 선택 
		sc.nextLine();
		
		System.out.println();
		System.out.println();
	}
	
}
