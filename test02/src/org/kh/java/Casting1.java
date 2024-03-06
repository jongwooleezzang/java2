package org.kh.java;
//형번환1 (Auto Casting , Force Casting) = type conversion
public class Casting1 {
     public static void main(String[] args) {
  //Auto Casting(묵시적형변환) : 작은크기의 저장소에 있는 데이터값을 큰크기의 저장소로 옴겨지는것
 byte b = 20;   //1byte
 short s = b;   //2byte  :byte >> short
 int i = s;     //4byte  :short>> int
 long l = i;    //8byte  : int >> long
 //Force Casting(명시적형변환) : 큰 크기의 저장소에 있는 데이터 값을 별도의 타입 연산자를 활용하여 큰크기의 저장소로 옴겨지는것
 int i2 =(int)l; 
 short s2=(short)i;
 byte b2 =(byte)s;
	}

}
