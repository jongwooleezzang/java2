package sec2;

public class StringEx1 {

	public static void main(String[] args) {
		String name1="�����";
		String name2 = new String("�����");
		Integer su1 = 1004; //������ ����
		String su2 ="1004";
		//System.out.println(su1.equals(su2));// int�� String �� ���Ҽ�����
		//String su3 = new String(su1);
		String su3 = String.valueOf(su1);
		System.out.println(su1.equals(su2));// �ΰ��� ���������� 
		System.out.println(su2.equals(su3));// su3 �� su1 Ÿ������
		
		String str ="a/b/c/d/e/f";
		String [] names = new String[6];
		names = str.split("/");
		for(String s:names) {
		System.out.println(s);
		}
		String str2 = String.join("/", names); //���ڿ���ġ��
		System.out.println(str2);
		
		
		String data = " ivE\'s beaUty grOup \n newJeans is girlGroup Top " ;
		
		char ten = data.charAt(9); ; //10 ��° ���� (�ε����� 9�� ����)
		System.out.println("10���� ����(�ε�����9�ι���) : " +ten);
		String trimData = data; //�յ��� ������ �����Ͽ� trimData�� ����
		System.out.println("�� ���� ������ ���� :" +trimData.length()+"����,"+trimData); 
		int size = data.trim().length(); //���ڼ��� size�� ����
		System.out.println("�� �� ������ ������ ���ڼ� :" +size);
		int n = data.indexOf('n'); //n�� ���� ��ġ�� n�� ����
		System.out.println("ù��° n�� ���� ��ġ(�ε���)�� n�� ����"+n);
		String up = data.toUpperCase(); //��� �빮�ڷ� ��ȯ�Ͽ� up�� ����
		System.out.println("��� �빮�ڷ� ��ȯ�Ͽ� up�� ���� : "+up); 
		String down = data.toLowerCase(); //��� �ҹ��ڷ� ��ȯ�Ͽ� down�� ����
		System.out.println("��� �ҹ��ڷ� ��ȯ�Ͽ� down�� ���� : "+down);
		String sub1 = data.substring(20,30); //������ �����ϰ�, 20��° ���� ���� 29������ �����Ͽ� sub1 �� ����(�߿�!!)
		System.out.println("������ �����ϰ� 20��° ���� ���� 27��°�� �����Ͽ� sub1�� ���� : "+sub1);
		String sub2 = data.replace("newJeans", "Kepler"); //newJeans�� �ܾ Kepler�� �����Ͽ� sub2�� ����
		System.out.println("newJeans�� �ܾ Kepler�� �����Ͽ� sub2�� ���� : "+sub2);
		byte[] girl = data.trim().getBytes(); // ���ڿ��� girl ���ڹ迭�� ��ȯ�Ͽ� ���� (�߿�!!)
		for(byte b:girl) {
			char k=(char)b;
			System.out.println(k);
		}
		String girlgroup = data.substring(data.lastIndexOf("g"),data.lastIndexOf("g")+9); //girl ��  g�� ������ ��ġ���� 9
		girlgroup += girlgroup+" "+ sub1;
		System.out.println("girl group : "+girlgroup);
		//����(byte)�迭�� ���ڿ� (sTring)���� ��ȯ ���
		String str4 = new String(girl);
		System.out.println(str4);
		
	}

}

