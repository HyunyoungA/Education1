package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_Constant;
import com.kh.variable.C_Cast;
import com.kh.variable.D_PrintMethod;
import com.kh.variable.E_KeyboardInput;

public class Run {
	public static void main(String[] args) {
		// 클래스 풀네임 적는 방법
		// com.kh.variable.A_Variable av = new com.kh.variable.A_Variable(); //알맹이 av
		//import를 쓰는 방법
		A_Variable av = new A_Variable();
		// ex. B_Test 알맹이
		//B_Test bt = new_Test();
//		av.declareVariable();
//		av.initVariable();
		
		B_Constant bc = new B_Constant();
//		bc.finalConstant();
		C_Cast cc = new C_Cast();
//		cc.cast1();
		cc.cast2();
		
		D_PrintMethod dp = new D_PrintMethod();
//		dp.printlnMethod();
//		dp.printMethod();
//		dp.printfMethod();
//		dp.stringExample();
		
		E_KeyboardInput ek = new E_KeyboardInput();
//		ek.inputScanner1();
//		ek.inputScanner2();
		
	}
}
