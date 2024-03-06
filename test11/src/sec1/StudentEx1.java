package sec1;

public class StudentEx1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student su1 = new Student();
		Student su2 = new Student();
		su2 = su1; //��������
		Student su3 = (Student) su1.clone();
		System.out.println(su1.getClass().toString());//�ش� ��ä�� Ŭ�����̸� ���
		System.out.println(su1 instanceof Student);//su1 �ν��Ͻ��� Student Ŭ������ �����Ȱ����� ������Ȯ�� 
		System.out.println(su1.toString());//�ּҸ� ���(���� su1 ��ü�� ���� stack���ִ� heap�� ��ġ��16���������
		System.out.println(su1.equals(su2)); //�� ��ü�� ������ Ȯ��
		System.out.println(su1.hashCode()); //�ؽ��ڵ�(16������ 10������ �ٲ�)��� �ּҰ�����
		//su3 �� su1�� �ּҰ� �޶� false
		//System.out.println(su3.equals(su1));
		//student Ŭ������ equals�� ��� �ɹ������� ���Ͽ� ���ϴ� �������̵��� ���ָ� �� �񱳰� �����ϴ�.
		
	}
	
		
	
}



