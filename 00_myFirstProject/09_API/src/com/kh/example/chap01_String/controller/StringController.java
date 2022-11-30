package com.kh.example.chap01_String.controller;

public class StringController {
	//String : ���ڿ� Ŭ���� <--���� �Ұ���
	//		���ڿ� �� ���� �Ұ���(�Һ�)
	//		String name = "abc";
	//		name = "def"; // <--������ �� �ƴѰ���? ��, �����Ȱ� �ƴ�.
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		//new �����ڷ� �������� ���� ������ ����� ���ο� �ּҰ��� �޾Ƽ�

		
		System.out.println("str1�� str2�� �ּҴ� ������? : " +( str1 == str2));//�ּҰ� ��, �ȿ� ���� ���ϰ������ equals
		System.out.println("str1�� str3�� �ּҴ� ������? : " + (str1 == str3));
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		//ObjectŬ������ toString()�� �������̵� �߱� ������ �ּ� ���� �ƴ� Java�� ��
		
		//�ּҰ��� �������� �޼ҵ� �Ծ��� �� ���ּҰ��� �ƴ� : --> hashCode() : ��ü�� �ּҰ��� �ؽ��ڵ�� ������ ��� ��.
		System.out.println("str1�� hashCode : " + str1.hashCode());
		System.out.println("str2�� hashCode : " + str2.hashCode());
		System.out.println("str3�� hashCode : " + str3.hashCode());
		
		// identityHashCode()
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
		//str3�� new�� ���ο� ���������ؼ� �ٸ� �ּҰ����� �����°� �� �� ����.
		
		str2 += "orecle"; //javaorecle
		System.out.println("str1�� hashCode : " + str1.hashCode());
		System.out.println("str2�� hashCode : " + str2.hashCode());
		System.out.println("str3�� hashCode : " + str3.hashCode());
		
		// identityHashCode()
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
	
	}
	// StringBuffer / StringBuilder : ���ڿ� Ŭ����
	// ���ڿ� �� ���� ����(���� Ŭ����)
	// --> StringŬ������ ������ ���� �б⸸ ���� ��쿡 ����.
	// --> ���ڿ��� ���� ������ ���� �Ͼ�ٸ� StringBuffer / StringBuilder�� ����
	// ��� �Ȱ����� ����ȭó�� ����(StringBuffer ����ȭ O / StringBuilder ����ȭX
	
	public void method2() {
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("�ʱ� buffer�� ���뷮 : " + buffer1.capacity());
		System.out.println("buffer1�� ����ִ� ���� ���� : " + buffer1.length());
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("�ʱ� nuffer2�� ���뷮 : " + buffer2.capacity());
		System.out.println("buffer2�� ����ִ� ���� ���� ���� : " + buffer2.length());
		
		StringBuffer buffer3 = new StringBuffer("abc");//���� ���뷮 16 +abc 3 = 19
		System.out.println("�ʱ� buffer3�� ���뷮 : " + buffer3.capacity());
		System.out.println("buffer3�� ����ִ� ���� ���� ���� : " + buffer3.length());//3
		
		System.out.println("buffer3 : " + buffer3);
		
		System.out.println("buffer3�� ���ּҰ� : " + System.identityHashCode(buffer3));
		
		//append() : �޾ƿ� ���� �ڿ� �߰��� �̾��ִ� �޼ҵ�
//		buffer3.append("abc"); //abcabc
//		System.out.println(buffer3);
//		System.out.println("buffer3�� ���ּҰ� : " + System.identityHashCode(buffer3));
//		System.out.println("abc �߰� ���� buffer3�� ���뷮 : " + buffer3.capacity());
//		System.out.println("abc �߰� ���� buffer3�� ����ִ� ���� ���� ���� : " + buffer3.length());//3+3 = 6
//		
//		buffer3.append("def"); //abcabcdef
//		System.out.println(buffer3);
//		System.out.println("def �߰� ���� buffer3�� ���뷮 : " + buffer3.capacity());
//		System.out.println("def �߰� ���� buffer3�� ����ִ� ���� ���� ���� : " + buffer3.length());//3+3+3 = 9
	
		buffer3.append("abc").append("def");//�޼ҵ� ü��
		//StringBuffer�ȿ� �ִ� append ȣ��--> .�� �ߺ��ߵ�.
		System.out.println(buffer3);
		System.out.println("def �߰� ���� buffer3�� ���뷮 : " + buffer3.capacity());
		System.out.println("def �߰� ���� buffer3�� ����ִ� ���� ���� ���� : " + buffer3.length());//3+3+3 = 9
	
		System.out.println();
		
//		insert() : (StringBuffer�� ����) ���ϴ� �ڸ��� �� �߰�
		buffer3.insert(2, "zzz");
		System.out.println("�ε��� 2�� zzz �߰� ���� buffer3 : " + buffer3); //abzzzcabcdef
		
		
//		delete() :  (StringBuffer�� ����) ���� ������ ���� (start <= index < end)
		//abzzzcabcdef
		//01234567891011
		//
		buffer3.delete(2, 5);
		System.out.println("�ε���2���� �ε��� 5���� ���� ���� buffer3 : " + buffer3); //abcabcdef
		
		//reverse()
		buffer3.reverse();
		System.out.println("reverse ���� buffer3 : " + buffer3);
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
		//abczzz			abyyczzz		zzzcyyba	zcyyba
		System.out.println(sb);
		
	}
	
		public void method3() {
			String str = "Hello World";
			// charAt(int index): char ==> ���ڿ��� �ε��� ��°�� char��ȯ
			char ch = str.charAt(4);
			System.out.println(ch);
			
			//concat(String str):String ==> ���� ���ڿ� ���� �Ű������� ���� ���� �̾���� ���ڿ� ��ȯ
			String concatStr = str.concat("!!!");
			System.out.println("concatStr : " + concatStr);
			str +="!!!";
			System.out.println(str);
			
			//equals(Object anObject):boolean ==> ���ڿ��� ������ Ȯ��
			System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
			
			//substring(int beginIndex) : String 
			//substring(int beginIndex, int endIndex) : String
			//���ڿ��� �Ϻ� ��ȯ
			System.out.println("str.substring(6) : " + str.substring(6));
			System.out.println("str.substring(0, 4) : " + str.substring(0, 4));
			
			//replace(char oidChar, char newChar):String ==> ���� ���ڸ� ���ο� ���ڷ� ��ü�Ͽ� ��ȯ
			System.out.println("str.replace('l', 'e') : " + str.replace('l', 'e'));
			
			//toUpperCase()/toLowerCase():String ==> ���ڿ��� ��/�ҹ��ڷ� ���� �� ��ȯ
			System.out.println("str.toUpperCase() : " + str.toUpperCase());
			System.out.println("str.toUpperCase() : " + str.toLowerCase());
			
			//equalsIgnoreCase(String anotherString) : boolean
			String str2 = "Wonderful";
			String str3 = "wonderful";
			System.out.println(str2.equals(str3));
			System.out.println(str2.equalsIgnoreCase(str3));
			
			//trim():String ==> �յڿ� �ִ� �� ������ ������ ���ڿ� ��ȯ
			String str4 = "     Java";
			String str5 = "Java     ";
			String str6 = "     Java     ";
			System.out.println(str4 + " : " + str4.trim());
			System.out.println(str5 + " : " + str5.trim());
			System.out.println(str6 + " : " + str6.trim());
			
			//split(String str):String[] ==> ���޹��� �����ڸ� ���� ���ڿ��� �߶� String[] ��ȯ
			String splitStr = "Java, Oracle, JDBC, Front, Server, Framwork";
			String[] strArr = splitStr.split(", ");
			for(int i = 0; i < strArr.length; i++) {
				System.out.println(strArr[i]);
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}