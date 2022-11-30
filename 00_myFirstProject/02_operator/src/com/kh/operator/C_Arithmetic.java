package com.kh.operator;

public class C_Arithmetic {
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		//나누기(/)는 나눗셈에 대한 몫 계산
		System.out.println("num1 / num2 = " + (num1 / num2));
		//%모듈러는 나눗셈에서 발생하는 나머지 계산
		System.out.println("num1 % num2 = " + (num1 % num2));
	}
	
	public void method2() {
		double a = 35;
		double b = 10;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		double add = a + b; //45.0
		double sub = a - b; //25.0
		double mul = a * b; //350.0
		double div = a / b; //3.0  
		double mod = a % b; //5.0
		
		System.out.println("a + b = " + add);
		System.out.println("a - b = " + sub);
		System.out.println("a * b = " + mul);
		System.out.println("a / b = " + div);
		System.out.println("a % b = " + mod);
	}
	
	public void method3() {
		int a = 5;
		int b = 10;
		
		int c = (++a) + b; //16
		int d = c / a;  
		//16 / 6 d=2
		int e = c % a;  
		// 16%6 
		int f = e++;  
		//f = 4 e = 5
		int g = (--b) + (d--);  
		//9+1=11
		int h = 2; 
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		//5+10/(7)*(8)%(4)=5+1*8%4=5+8%4=13%4=3
		//		6	+9/(15/4)* (11-1)%(6+2)
		//		6+  9/ 3	*	10	%	8
		//		6+	3		*	10  %	8
		//		6+		30		%	8
		//		6+			6
		//		12
		
		System.out.println("a : " + a); //7
		System.out.println("b : " + b); //9
		System.out.println("c : " + c); //15
		System.out.println("d : " + d); //1
		System.out.println("e : " + e); //6
		System.out.println("f : " + f); //4
		System.out.println("g : " + g); //10
		System.out.println("h : " + h); //2
		System.out.println("i : " + i); //12
			
	}
}
