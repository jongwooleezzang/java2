package org.kh.java;

public class Variable5 {

	public static void main(String[] args) {
char ch1 ='H';
char ch2 = 65;
char ch3 = 82;
char ch4 = '\u2665'; 
//char ch5 = -65; 코드넘버는 순번이므로 음수값을 가질수없다
char ch5 =121;
char ch6 = '\u26BD';
System.out.println("ch1:"+ch1);
System.out.println("ch2:"+ch2); //65는 아스키코드 A //아스키:키보드영문자판으로 바꾸기위한코드
System.out.println("ch3:"+ch3); //82는 아스키코드 R
System.out.println("ch6:"+ch6); 

System.out.println("코드 넘버");
System.out.println("ch1:"+ (int)ch1); //강제 형변환
System.out.println("ch4:"+(int)ch4);
System.out.println("ch5: " + (int)ch5);
System.out.println("ch6:"+(int)ch6);


		
	}

}
