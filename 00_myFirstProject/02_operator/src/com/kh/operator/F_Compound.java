package com.kh.operator;

public class F_Compound {
	public void method() {
		int a = 10;
//		a = a + 4;
		a += 4;
		System.out.println(a);
		
		int b = 8;
//		b = b - 3;
		b -= 3;
		System.out.println(b);
		
		int c = 15;
//		c = c * 2;
		c *= 2;
		System.out.println(c);
		
		int d = 42;
//		d = d / 7;
		d /= 7;
		System.out.println(d);
		
		int e = 24;
//		e = e % 4;
		e %= 4;
		System.out.println(e);
	}
}
