package sec1;
//�����߿��Ѱ�!!!: �������� equals �� �����ؾ��� == �����ϸ�ȵ�

public class Exam1 {
	public static void main(String[] args) {
		int a = 1004;	//������
		int b = 1004;
		System.out.println("a==b :" + (a==b));  //�ܼ� �� ��
		
		String s1 = "�����"; //���ڴ� �⺻���� �������� �ƴϴ�.
		String s2 = "�����";
		System.out.println(s1==s2); //���ڿ��� �� ��  (Ʋ��)
		System.out.println("s1 equals s2 : "+(s1.equals(s2))); //�´� ���ڿ��� ���� (����) //String �� Ŭ���������� �ؾ��Ϲ�
		
		Integer c = new Integer(1004);	//������
		Integer d = new Integer(1004);
		
		System.out.println("a==c  :"+ (a==c));	//�⺻���� �������� �񱳴� ���� 
		System.out.println("c==d  :"+ (c==d)); //������ �� �������� �񱳴� �ּҺ� 
		System.out.println("c equals d : "+(c.equals(d)));//������������ �񱳴� equals �������
		
		
	}
	
}

