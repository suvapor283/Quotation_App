package com.ll;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("== 명언 앱 ==");
		
		while (true) {
			System.out.print("명령어 : ");
			String cmd = sc.nextLine().trim();
			
		if (cmd.equals("종료")) {
			break;
			}
		}
		
		sc.close();
		System.out.println("== 종료 ==");
	}
}