package com.kh.test;


public class Test {
	//String : ���ڿ� Ŭ������ ���� �Ұ���!!
		public static final double PI = 3.14;
		public double radius;
		
		public Test(double radius) {
			this.radius = radius;
		}
		public double getReadius() {
			return radius;
		}
		public void setReadius(double redius) {
			this.radius = radius;
		}
		public static double getPi() {
			return PI;
		}
		public void draw() {
			System.out.println("������" + radius + "cm�� ���� �׸��ϴ�");
		}
		}
		
		
		
	
//		String str1 = "java";
//		String str2 = "java";
//		String str3 = new String("java");
//		
//		System.out.println("str1�� str2�� �ּҴ� ������? : " + (str1 == str2));
//		System.out.println("str1�� str3�� �ּҴ� ������? : " + (str1 == str3));
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		
//		System.out.println("str1�� hashCode : " + str1.hashCode());
//		System.out.println("str2�� hashCode : " + str2.hashCode());
//		System.out.println("str3�� hashCode : " + str3.hashCode());
//		
//		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
//		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
//		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
//		//str3�� new�� ���ο� ���������� �ؼ� ���ּҰ��� �ٸ�.
//		
//		str2 += "orecle";
//		System.out.println("str1�� hashCode : " + str1.hashCode());
//		System.out.println("str2�� hashCode : " + str2.hashCode());
//		System.out.println("str3�� hashCode : " + str3.hashCode());
//		
//		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1));
//		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
//		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3));
//
//	}
//	public void method2() {
//		StringBuffer buffer1 = new StringBuffer();
//		System.out.println("�ʱ�buffer�� ���뷮 : " + buffer1.capacity());
//		System.out.println("buffer1�� ����ִ� ���� ���� : " + buffer1.length());
//		
//		System.out.println();
//		
//		StringBuffer buffer2 = new StringBuffer(100);
//		System.out.println("�ʱ� buffer2�� ���뷮 : " + buffer2.capacity());
//		System.out.println("buffer2�� ����ִ� ���� ���� ���� : " + buffer2.length());
//		
//		StringBuffer buffer3 = new StringBuffer("abc");
//		System.out.println("�ʱ� buffer3�� ���뷮 : " + buffer3.capacity());
//		System.out.println("buffer3�� ����ִ� ���� ���� ���� : " + buffer3.length());
//		
//		System.out.println("buffer3 : " + buffer3);
//		
//		System.out.println("buffer3�� ���ּҰ� : " + System.identityHashCode(buffer3));
//		
//		buffer3.append("abc").append("def");
//		System.out.println(buffer3);
//		System.out.println("def �߰� ���� buffer3�� ���뷮 : " + buffer3.capacity());
//		System.out.println("def �߰� ���� buffer3�� ����ִ� ���� ���� ���� : " + buffer3.length());
//		
//		System.out.println();
//		
//		buffer3.insert(2, "zzz");
//		System.out.println("�ε��� 2�� zzz �߰� ���� buffer3 : " + buffer3);
//		
//		buffer3.delete(2, 5);
//		System.out.println("�ε���2���� �ε��� 5���� ���� ���� buffer3 : " + buffer3);
//		
//		buffer3.reverse();
//		System.out.println("reverse ���� buffer3 : " + buffer3);
//		
//		StringBuffer sb = new StringBuffer("abc");
//		sb.append("zzz").insert(2, "yy").reverse().delete(1, 3);
//		
//		System.out.println(sb);
//		
//		
//	}
//	
//	public void method3() {
//		String str = "Hello World";
//		char ch = str.charAt(4);
//		System.out.println(ch);
//		
//		String concatStr = str.concat("!!!");
//		System.out.println("concatStr : " + concatStr);
//		str +="!!!";
//		System.out.println(str);
//		
//		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
//		
//		System.out.println("str.substring(6) : " + str.substring(6));
//		System.out.println("str.substring(0, 4) : " + str.substring(0, 4));
//		
//		System.out.println("str.replace('l', 'e') : " + str.replace('l', 'e'));
//		
//		System.out.println("str.toUpperCase() : " + str.toUpperCase());
//		System.out.println("str.toLowerCase() : " + str.toLowerCase());
//		
//		String str2 = "Wonderful";
//		String str3 = "Wonderful";
//		System.out.println(str2.equals(str3));
//		System.out.println(str2.equalsIgnoreCase(str3));
//		
//		String str4 = "     Java";
//		String str5 = "Java     ";
//		String str6 = "     Java     ";
//		System.out.println(str4 + " : " + str4.trim());
//		System.out.println(str5 + " : " + str5.trim());
//		System.out.println(str6 + " : " + str6.trim());
//		
//		System.out.println(str6 +":"+ str.trim());
//		
//		String splitStr = "Java, Oracle, JDBC, Front, Server, FramWork";
//		String[] strArr = splitStr.split(", ");
//		for(int i = 0; i < strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
//	}
//	public void method9() {
//		Calendar c = Calendar.getInstance();
//		System.out.println(c);
//		
//		int year = c.get(Calendar.YEAR);
//		System.out.println(year);
//		int month = c.get(Calendar.MONTH);
//		System.out.println(month);
//	}
//	
//	public void method10() {
//		GregorianCalendar gc = new GregorianCalendar();
//		System.out.println(gc);
//		
//		System.out.println(gc.get(Calendar.YEAR));
//		
//		GregorianCalendar end = new GregorianCalendar(2022, 6, 13, 17, 15, 0);
//		long time = end.getTimeInMillis();
//		Date endDate = new Date(time);
//		System.out.println(endDate);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E���� a hh�� mm�� ss��");
//		String fmt = sdf.format(endDate);
//		System.out.println(fmt);
//		
//		
//		
//	}
//	
//	
//	
