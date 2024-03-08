package sec1;
//Enum: ���������� ����̳� �ν��Ͻ��� ������ �� ���� => public , static , final
//������ ���� �ǹ̸� ��Ȯ�ϰ� �ؾ� �ϰų� �����Ͻÿ� ������ Ÿ�� �� ��ȿ�� üũ�� �Ϸ��� �� ��� Ȱ��
enum Week1{//����� �⺻ =>�빮�ڷ� ����
	SUN,MON,TUE,WED,THU,FRI,SAT
}
enum Week2{//valueOf(String str) -���ڿ� str�� ��ġ�ϴ� ���Ű��� ��ȯ 
//values() : ����(��)�� ��ü�� �迭�� ��ȯ
//ordinal(): ����(��)�� ������ ��ȯ
	SUN("��"),MON("��"),TUE("ȭ"),WED("��"),THU("��"),FRI("��"),SAT("��");
	final private String day;
	
	Week2(String day){
		this.day =day;
	}
	String getDay() {
		return day; 
	} 
	
	
}
public class EnumEx1 {
	public static void main(String[] args) {
		String s ="MON";
		Week1 w1 =Week1.SUN;
		Week2 w2 =Week2.valueOf(s);
		
		
	}
}
