package src3;

public class People {
  public static int selNum = 100;  //������ȣ -�����ʵ�=�����ʵ�
  //static : ��ü�� ���� ���� �޸𸮰� ������
  public String name;		//�̸�
  public int age;			//����
  public String addr;		//�ּ�
  
  public void print1() {
	  System.out.println("selNum :"+this.selNum);
	  System.out.println("name:"+this.name);
  }
  public void print2() {
	  System.out.println("selNum :"+this.selNum);
	  System.out.println("name:"+this.name);
  }
}
