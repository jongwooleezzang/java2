package org.kh.java;

public class Variable3 {

	public static void main(String[] args) {
 int bin = 0b10111; //0b 이진수 데이터를 표현
 int oct = 03647; // 0 은 8진수 데이터를 표현
 int dec = 3650; // 10진수 데이터 입력시 해당 숫자만 입력
 int hex = 0x2c8; //16진수 데이터 입력시 숫자앞에 0x로 시작
 System.out.println("oct="+oct);
 System.out.println("bin="+bin);
 System.out.println("dec="+dec);
 System.out.println("hex="+hex);
 System.out.println("각진수로 출력");
 System.out.println("dec를 2진수=>"+Integer.toBinaryString(dec));	
 System.out.println("dec를 8진수=>"+Integer.toOctalString(dec));
 System.out.println("dec를 16진수=>"+Integer.toHexString(dec));
 /*
  형식문자코드 =>> printf
  %s :문자열
  %d :10진 정수
  %f :실수
  %o :8진수
  %x :16진수
  %e :지수
  %n :줄바꿈
    */
 System.out.printf("dec를 8진수=>%o",dec);
 System.out.printf("");
}

}
