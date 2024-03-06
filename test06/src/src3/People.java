package src3;

public class People {
  public static int selNum = 100;  //고유번호 -정적필드=공유필드
  //static : 객체와 관계 없이 메모리가 공유됨
  public String name;		//이름
  public int age;			//나이
  public String addr;		//주소
  
  public void print1() {
	  System.out.println("selNum :"+this.selNum);
	  System.out.println("name:"+this.name);
  }
  public void print2() {
	  System.out.println("selNum :"+this.selNum);
	  System.out.println("name:"+this.name);
  }
}
