package com.kh.example.chap01_String.controller;

public class StringController {
	//String : 문자열 클래스 <--수정 불가능
	//		문자열 값 수정 불가능(불변)
	//		String name = "abc";
	//		name = "def"; // <--수정된 거 아닌가요? 응, 수정된거 아님.
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		//new 연산자로 힙영역에 새로 공간을 만들어 새로운 주소값을 받아서

		
		System.out.println("str1과 str2의 주소는 같은가? : " +( str1 == str2));//주소값 비교, 안에 값을 비교하고싶으면 equals
		System.out.println("str1과 str3의 주소는 같은가? : " + (str1 == str3));
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		//Object클래스의 toString()를 오버라이딩 했기 때문에 주소 값이 아닌 Java가 뜸
		
		//주소값을 보기위한 메소드 규약이 들어감 실주소값은 아님 : --> hashCode() : 객체의 주소값을 해시코드로 구현한 결과 값.
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
		
		// identityHashCode()
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
		//str3는 new로 새로운 공간생성해서 다른 주소값으로 찍히는걸 볼 수 있음.
		
		str2 += "orecle"; //javaorecle
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
		
		// identityHashCode()
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
	
	}
	// StringBuffer / StringBuilder : 문자열 클래스
	// 문자열 값 수정 가능(가변 클래스)
	// --> String클래스는 변경이 적고 읽기만 많은 경우에 적합.
	// --> 문자열에 대한 수정이 많이 일어난다면 StringBuffer / StringBuilder가 적합
	// 모두 똑같으나 동기화처리 차이(StringBuffer 동기화 O / StringBuilder 동기화X
	
	public void method2() {
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("초기 buffer의 수용량 : " + buffer1.capacity());
		System.out.println("buffer1에 들어있는 실제 길이 : " + buffer1.length());
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("초기 nuffer2의 수용량 : " + buffer2.capacity());
		System.out.println("buffer2에 들어있는 실제 값의 길이 : " + buffer2.length());
		
		StringBuffer buffer3 = new StringBuffer("abc");//기존 수용량 16 +abc 3 = 19
		System.out.println("초기 buffer3의 수용량 : " + buffer3.capacity());
		System.out.println("buffer3에 들어있는 실제 값의 길이 : " + buffer3.length());//3
		
		System.out.println("buffer3 : " + buffer3);
		
		System.out.println("buffer3의 실주소값 : " + System.identityHashCode(buffer3));
		
		//append() : 받아온 값을 뒤에 추가로 이어주는 메소드
//		buffer3.append("abc"); //abcabc
//		System.out.println(buffer3);
//		System.out.println("buffer3의 실주소값 : " + System.identityHashCode(buffer3));
//		System.out.println("abc 추가 후의 buffer3의 수용량 : " + buffer3.capacity());
//		System.out.println("abc 추가 후의 buffer3에 들어있는 실제 값의 길이 : " + buffer3.length());//3+3 = 6
//		
//		buffer3.append("def"); //abcabcdef
//		System.out.println(buffer3);
//		System.out.println("def 추가 후의 buffer3의 수용량 : " + buffer3.capacity());
//		System.out.println("def 추가 후의 buffer3에 들어있는 실제 값의 길이 : " + buffer3.length());//3+3+3 = 9
	
		buffer3.append("abc").append("def");//메소드 체인
		//StringBuffer안에 있는 append 호출--> .을 잘봐야됨.
		System.out.println(buffer3);
		System.out.println("def 추가 후의 buffer3의 수용량 : " + buffer3.capacity());
		System.out.println("def 추가 후의 buffer3에 들어있는 실제 값의 길이 : " + buffer3.length());//3+3+3 = 9
	
		System.out.println();
		
//		insert() : (StringBuffer에 있음) 원하는 자리에 값 추가
		buffer3.insert(2, "zzz");
		System.out.println("인덱스 2에 zzz 추가 후의 buffer3 : " + buffer3); //abzzzcabcdef
		
		
//		delete() :  (StringBuffer에 있음) 지정 데이터 삭제 (start <= index < end)
		//abzzzcabcdef
		//01234567891011
		//
		buffer3.delete(2, 5);
		System.out.println("인덱스2부터 인덱스 5까지 삭제 후의 buffer3 : " + buffer3); //abcabcdef
		
		//reverse()
		buffer3.reverse();
		System.out.println("reverse 후의 buffer3 : " + buffer3);
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
		//abczzz			abyyczzz		zzzcyyba	zcyyba
		System.out.println(sb);
		
	}
	
		public void method3() {
			String str = "Hello World";
			// charAt(int index): char ==> 문자열의 인덱스 번째의 char반환
			char ch = str.charAt(4);
			System.out.println(ch);
			
			//concat(String str):String ==> 원래 문자열 끝에 매개변수로 들어온 값을 이어붙인 문자열 반환
			String concatStr = str.concat("!!!");
			System.out.println("concatStr : " + concatStr);
			str +="!!!";
			System.out.println(str);
			
			//equals(Object anObject):boolean ==> 문자열이 같은지 확인
			System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
			
			//substring(int beginIndex) : String 
			//substring(int beginIndex, int endIndex) : String
			//문자열의 일부 반환
			System.out.println("str.substring(6) : " + str.substring(6));
			System.out.println("str.substring(0, 4) : " + str.substring(0, 4));
			
			//replace(char oidChar, char newChar):String ==> 기존 문자를 새로운 문자로 대체하여 반환
			System.out.println("str.replace('l', 'e') : " + str.replace('l', 'e'));
			
			//toUpperCase()/toLowerCase():String ==> 문자열을 대/소문자로 변형 후 반환
			System.out.println("str.toUpperCase() : " + str.toUpperCase());
			System.out.println("str.toUpperCase() : " + str.toLowerCase());
			
			//equalsIgnoreCase(String anotherString) : boolean
			String str2 = "Wonderful";
			String str3 = "wonderful";
			System.out.println(str2.equals(str3));
			System.out.println(str2.equalsIgnoreCase(str3));
			
			//trim():String ==> 앞뒤에 있는 빈 공간을 제거한 문자열 반환
			String str4 = "     Java";
			String str5 = "Java     ";
			String str6 = "     Java     ";
			System.out.println(str4 + " : " + str4.trim());
			System.out.println(str5 + " : " + str5.trim());
			System.out.println(str6 + " : " + str6.trim());
			
			//split(String str):String[] ==> 전달받은 구분자를 통해 문자열을 잘라 String[] 반환
			String splitStr = "Java, Oracle, JDBC, Front, Server, Framwork";
			String[] strArr = splitStr.split(", ");
			for(int i = 0; i < strArr.length; i++) {
				System.out.println(strArr[i]);
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}