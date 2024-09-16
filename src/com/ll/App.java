package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public void run() {
		Scanner sc = new Scanner(System.in);
		
		List<Quotation> quotations = new ArrayList<>();
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
				
				quotations.add(new Quotation(++lastQuotationId, quotation, writer));
				System.out.println(lastQuotationId + "번 명언이 등록되었습니다.");
			}
			
			else if (cmd.equals("목록")) {
				if (quotations.isEmpty()) {
					System.out.println("게시물이 존재하지 않습니다.");
					continue;
				}
				
				System.out.println("번호	|	작가	|	명언");
				for(int i = quotations.size()-1; i >= 0; i--) {
					Quotation quotation = quotations.get(i);
					System.out.printf("%d	|	%s	|	%s\n", quotation.id, quotation.quotation, quotation.writer);
				}
			}
		}

		sc.close();
		System.out.println("== 종료 ==");
	}
}