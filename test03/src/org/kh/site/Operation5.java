package org.kh.site;
//관계(비교) 연산자 : ==(같다) , !=(같지않다) , >(초과) , >=(이상),<(미만), <=(이하) 결과값은true 아니면 false
public class Operation5 {
	public static void main(String[] args) {
  int a= 25;
  int b= 28;
  int c= 27;
   System.out.println("a와b가 같습니까?: "+(a==b)); //f
   System.out.println("a와b가 다릅니까?:"+(a!=b)); //t
   System.out.println("a가b보다 큽니까?:"+(a>b));  //f
   System.out.println("b가c보다 크거나 같습니까?"+(b>=c)); //t
   System.out.println("a가b보다 작습니까?:"+(a<b)); //t
   System.out.println("b가c보다 작거나 같습니까?:"+(b<=c)); //f
		
		
	}

}
