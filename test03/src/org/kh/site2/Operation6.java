package org.kh.site2;
//논리 연산자 : &&(and) , ||(or) , !(not)   
public class Operation6 {

	public static void main(String[] args) {
    int a =26 ;
    int b =28 ;
    int c =27 ;
    //and 논리 : 모든 입력이 true일 경우 출력이 true 가 된다(둘다 true일 경우만 true)
      System.out.println("a>b && a>c : "+(a > b && a > c));
      								    //false && false
      System.out.println("a>b && b>c : "+(a > b && b > c));
      									//false && true
      System.out.println("a<b && b<c : "+(a < b && b < c));
      								 	//true  && false
      System.out.println("a>b && b>c : "+(a < b && b > c));
      									//true  && true
     
     //or 논리 : 입력이 어느 하나라도 true 일 경우 출력이 true가 된다(둘중 하나만 true면 true)
      System.out.println("a>b || a>c : "+(a > b || a > c));
	                                    //false || false
      System.out.println("a>b || b>c : "+(a > b || b > c));
		                                //false || true
      System.out.println("a<b || b<c : "+(a < b || b < c));
	 	                                //true  || false
      System.out.println("a>b || b>c : "+(a < b || b > c));
		                                //true  || true
    
      System.out.println( );
      //not 논리: 입력이 true이면 출력은 false 입력이 false면 출력은 true
      System.out.println("a>b !! a>c : "+!(a > b ));
                                        //false
      System.out.println("a>b !! b>c : "+!(a > b ));
                                        //false 
      System.out.println("a<b !! b<c : "+!(a < b ));
                                        //true  
      System.out.println("a>b !! b>c : "+!(a < b ));
                                        //true  
      
     
      
      
      
      
      
      
      
      
	}

}
