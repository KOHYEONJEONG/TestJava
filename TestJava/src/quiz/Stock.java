package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Stock {// 모의주식

	Scanner sc = new Scanner(System.in);

	// 기본 주식 데이터
	List<HashMap<String, String>> company = new ArrayList<HashMap<String, String>>();
	String[] name = { "샘성", "까까오", "웹플릭스"};
	String[] price = { "100", "80", "150" };

	// 보유중인 주식 데이터
	HashMap<String, Integer> my_stock = new HashMap<String, Integer>();

	// 초기 자금
	int money = 500;

	// 구매&판매 수수료
	final float PURC_FEE = 1 + 0.01f;
	final float SALES_COMM = 1 - 0.04f;
	
	int day = 1;

	public void run() {
		boolean r = true;
		while (r) {
			System.out.println("------"+day+"일차 & 보유자금: "+money+"원------");
			System.out.println("1.변동 2.구매 3.보유내역 9.종료");
			
			System.out.print("입력>>");
			switch (sc.nextLine()) {
				case "1":
					change();
					break;
				case "2":
					buy();
					break;
				case "3":
					mypage();
					break;
				case "9":
					System.out.println("종료하겠습니다.");
					r = false;
					break;
				default:
					System.out.println("잘못 입력하겠습니다.");
			}
		}
	}

	public void mypage() {// 보유내역
		
		System.out.println("[보유내역]");
		System.out.println("주식명\t장수\t");
		
		if(company.size() == 0) {
			for(int i=0; i<name.length; i++) {
				HashMap<String, String> com_data = new HashMap<String, String>();
				com_data.put("name", name[i]);
				com_data.put("price", price[i]);
				com_data.put("change","- %");

				company.add(com_data);

				my_stock.put(name[i], 0);//주식명, 개수
			}
		}
		
		for(int i=0; i<name.length; i++) {
			if(my_stock.get(name[i]).equals(null)) {
				System.out.println(name[i]+"\t"+0+"\t");
			}else {
				System.out.println(name[i]+"\t"+my_stock.get(name[i])+"\t");
			}
		
		}
		
		System.out.println("=====================================");
		
	}

	public void buy() {//구매
		view();
		System.out.println("");
		System.out.print("주식명 입력 >> ");
		String search = sc.nextLine();
		
		System.out.print("장 수 입력 >> ");
		int ea = Integer.parseInt(sc.nextLine());
		
		//검색한 항목이 있는지 확인
		boolean flag = false;
		for(String str : name) {
			if(search.equals(str)) {
				flag = true;
				break;
			}
		}
		
		//검색항목 구매
		if(flag) {
			//주식명이 맞다면
			for(int i=0; i<company.size();i++) {
				if(search.equals(company.get(i).get("name"))) {
					
					//절사
					int cost = Math.round((Integer.parseInt(company.get(i).get("price"))*ea*PURC_FEE));//수수료포함한 금액
					
					if(money > cost) {
						my_stock.put(search, my_stock.get(search)+ea);
						money -= cost;
						System.out.println("[완료]"+search+" 주식 :"+ea+"장 구매 완료");
						break;
					}else {
						System.out.println("[에러] 보유자금 부족합니다.");
						System.out.println("[현재자금] "+money+"원\t"+"[구매가] "+cost+"원\n");
						break;
					}
				}
			}
		}else {
			System.out.println("[에러] 없는 주식입니다.");
		}
	}

	public void view() {
		System.out.println("※주식현황※");
		System.out.println("｜no|종목명\t｜가격\t｜변동가\t｜");
		for(int i=0; i<company.size(); i++) {
			System.out.print("｜"+(i+1)+".");
			System.out.print("｜"+company.get(i).get("name")+"｜");
			System.out.print(company.get(i).get("price")+"｜");
			System.out.print(company.get(i).get("change")+"%｜\n");
			
		}
		System.out.println("￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");
	}

	public void change() {
		if(company.size() == 0) {
			for(int i=0; i<name.length; i++) {
				HashMap<String, String> com_data = new HashMap<String, String>();
				com_data.put("name", name[i]);
				com_data.put("price", price[i]);
				com_data.put("change","- %");

				company.add(com_data);

				my_stock.put(name[i], 0);//주식명, 개수
			}
		}else {
			for(int i=0; i<company.size(); i++) {
				
				//랜덤값 
				Random rd = new Random();
				float ascent_fall_rate = (rd.nextInt(10)-5)/100.0f;
				//System.out.println(ascent_fall_rate);

				int now_price = Integer.parseInt(company.get(i).get("price"));
				float chg_price = now_price * ascent_fall_rate;
				String print_chg_price = "";//출력

				if(Math.round(chg_price)>0) { 
					print_chg_price =" "+Math.round(chg_price)+"🔼";
				}else if(Math.round(chg_price)<0) {
					print_chg_price = " "+Math.round(chg_price)+"🔽";
				}else {
					print_chg_price = " - ";
				}
				
				//현재가+(현재가*등가율)
				company.get(i).put("price",Integer.toString(Math.round(now_price+chg_price)));
				company.get(i).put("change",print_chg_price);
			}
			day++;//다음날로 변경
		}
		
	}
}
