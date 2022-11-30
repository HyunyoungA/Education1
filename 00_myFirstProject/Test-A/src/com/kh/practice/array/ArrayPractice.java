package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
////		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
////		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	public void practice2() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int[] d = new int[10];
		
		for(int c = d.length; c > 0; c--) {
			System.out.print(c + " ");
		}
	}
		public void practice3() {
//			사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//			1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
			Scanner sc = new Scanner(System.in);
			System.out.print("양수의 정수 : ");
			int num = sc.nextInt();
			
			int[] num2 = new int[num];
			for(int i = 0; i < num2.length; i++) {
				num2[i] = i+1;
				System.out.print(num2[i] + " ");
			}
			
		}
		
		public void practice4() {
//			길이가 5인 String배열을 선언하고 
//			“사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//			배열 인덱스를 활용해서 귤을 출력하세요.
			String[] str = new String[5];
			
			str[0] = "사과";
			str[1] = "귤";
			str[2] = "포도";
			str[3] = "복숭아";
			str[4] = "참외";
			System.out.println(str[1]);	
		}
		public void practice5() {
//			문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//			개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
			
			char[] ch2 = new char[str.length()];
			int i = 0;
			
			System.out.print(str + "에" + "" + ch + "가 존재하는 위치(인덱스) : ");
			
			for(int num = 0; num < str.length(); num++) {//입력받은 문자 출력 -->apple에 ㅇ가 존재하는 위치(인덱스) : 
				ch2[num] = str.charAt(num);
			
				if(ch == ch2[num]) {//입력받은 문자와 입력받은 문자열에 문자가 같다면,문자열 : apple 문자 : pp 라면 pp를 출력
					i++;
					System.out.print(num+" ");
				}
			}
			System.out.println();
			System.out.println(ch + "개수: " + i);
		}
		
		public void practice6() {
//			“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//			입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//			범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
			String[] str = {"월", "화", "수", "목", "금", "토", "일"};
			
			Scanner sc = new Scanner(System.in);
			System.out.print("0~6 사이 숫자 입력 : ");
			int num = sc.nextInt();
			
			if(num >= 0 && num <= 6) {
				System.out.println(str[num] + "요일");
			}else {
				System.out.println("잘못 입력하셨습니댜");
			}
		}	
		public void practice7() {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 : ");
			int num = sc.nextInt();
			System.out.print("배열 0번째 인덱스에 넣을 값 : ");
			int num2 = sc.nextInt();
			System.out.print("배열 1번째 인덱스에 넣을 값 : ");
			int num3 = sc.nextInt();
			System.out.print("배열 2번째 인덱스에 넣을 값 : ");
			int num4 = sc.nextInt();
			System.out.print("배열 3번째 인덱스에 넣을 값 : ");
			int num5 = sc.nextInt();
			System.out.print("배열 4번째 인덱스에 넣을 값 : "); 
			int num6 = sc.nextInt();
			
			int[] i = {num2, num3, num4, num5, num6};//나열하기
			for(int e = 0; e < i.length; e++) {
				System.out.print(i[e]+ " ");
			}
			System.out.println();
			System.out.println("총 합 : " + (num2 + num3 + num4 + num5 + num6));
		}
		public void practice8() {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 : ");
			int num = sc.nextInt();
			int[] num2 = {num/2, num/2-1, num/2-2};
			
			for(int i = 0; i <= num2.length; i++){
				System.out.println(num2[i]);	
			} 
		}
		
		public void practice9() {
//			사용자가 입력한 값이 배열에 있는지 검색하여
//			있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//			단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
			Scanner sc = new Scanner(System.in);
			System.out.print("치킨 이름을 입력하세요 : ");
			String str = sc.nextLine();
			String str2 ="양념";
			String str3= "후라이드";
			
//			String[] Date = new String[2];

			if(str == str2 && str == str3) {
				System.out.print(str2 + "치킨 배달 가능");
			}else {
				System.out.print(str + "치킨은 없는 메뉴입니다.");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}			
}
		
