package org.kh.java;

public class Variable1 {     //-129-128-10123456

	public static void main(String[] args) {
	boolean a = true; 	//논리형(true, false) :1byte
	byte b = 255; 		//-128~127 >> 255는 해당공간 보다 큰 숫자이므로 Overflow
	byte b = -129; 		//해당 공간에 저장할 수 있는 숫자보다 더 작은숫자이므로 Underflow
	byte b= 126; 		//1byte=8bit=256가지 저장가능(-128~127)
	short c = 32767; 	//2byte=16bit=65536가지저장가능(-32768~32767)
	char d = 'k'; 		//2byte  한글자문자
	int e = 234567; 	//4byte 정수
	float f = 3.14f; 	//4byte 실수만가능 f>>실수임을 나타냄
	long g = 23456789; 	//8byte 길게가능
	double h = 3.14; 	//8byte 
	System.out.println("byte : "+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
	System.out.println("short : "+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
	System.out.println("character : " + Character.MIN_VALUE + "~" + Character.MAX_VALUE);
	System.out.println("int : "+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
	System.out.println("float : "+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
	System.out.println("long : "+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
	System.out.println("double : "+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
	}

}
