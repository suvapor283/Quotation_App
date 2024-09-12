package com.ll;

import java.util.Scanner;

public class App {

	public void run() {
		Scanner sc = new Scanner(System.in);
		
		int lastQuotationId = 0;

		System.out.println("== 명언 앱 ==");

		while (true) {
			System.out.print("명령어 : ");
			String cmd = sc.nextLine().trim();

			if (cmd.equals("종료")) {
				break;
			}
			
			if (cmd.equals("등록")) {
				System.out.print("명언 : ");
				String quotation = sc.nextLine().trim();
				System.out.print("작가 : ");
				String writer = sc.nextLine().trim();
				
				System.out.println(++lastQuotationId + "번 명언이 등록되었습니다.");
			}
		}

		sc.close();
		System.out.println("== 종료 ==");
	}
}