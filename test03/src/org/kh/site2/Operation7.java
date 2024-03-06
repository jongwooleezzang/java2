package org.kh.site2;
//대입 연산자 : 연산 후에 대입하는 연산자 (=+ ,-= , *=, /= , %=, |=, >>=, <<= , >>>=, ^=)
public class Operation7 {

	public static void main(String[] args) {
int a = 20;
int b = 15;
int c ;
 a += b;  // a=35 , b=15  a에 15를 더한값을 다시 a에 넣어라
 b -= a;  // a=35 , b=-20
 System.out.println("a :"+a);
 System.out.println("b :"+b);
 
//Q. a값과b값을 바꾸시오 a=35 , b=-20
//N. 
 c=a; 
 a=b;
 b=c;
 System.out.println(" 맞교환");
 System.out.println("a :"+a);
 System.out.println("b :"+b);
 System.out.println("c :"+c);
 
 int x = 0b01101;// 13
 int y = 0b01011;// 11
 System.out.println("x="+Integer.toBinaryString(x));
 System.out.println("y="+Integer.toBinaryString(y));
 //비트(2진수)연산자 : &(and) , |(or) , ~(not) , ^(xor) ,>>> , >>(나누기4) , << (곱하기4)  2진수 연산할때 하나만쓴다  
 System.out.println("x & y :"+Integer.toBinaryString(x & y)); //and
 System.out.println("x | y :"+Integer.toBinaryString(x | y)); //or
 System.out.println("~x:"+Integer.toBinaryString(~x));      
 System.out.println("x^y:"+Integer.toBinaryString(x^y));      //xor 입력이서로같은경우0 다를경우 1
 System.out.println("x>> 2 :"+Integer.toBinaryString(x >> 2));  //right shift 오른족으로 2번밀어라  
 System.out.println("x<< 2:"+Integer.toBinaryString(x<< 2));
System.out.println("*********대입 연산자**********");
 int i =25; //11001
 int j =30; //11110
 i &=j ; // i = i & j  -> 11000(2진수) --> 24(10진수)
 System.out.println("i &= j :"+ i ); //11100 -->24
 i=25;
 i ^=j; // i =i^j
 System.out.println("i^ = j:"+i); //00111 -->7
 j=30;
 j<<=2;
 System.out.println("j <<=2:" +j);
 j = 30;
 j >>>=2;
 
 System.out.println("j >>>=2:" +j);
 
		
		
		
		
	}

}
