package sec2;

import java.io.Console;
import java.io.IOException;

public class ConsoleEx {
	public static void main(String[] args) throws IOException {
		Console con =System.console();
		System.out.println("�̸� : ");
		
		String name = con.readLine();

		System.out.println("���� : ");
		int point = Integer.parseInt(con.readLine());

		System.out.println("ü�� : ");
		double weight = Double.parseDouble(con.readLine());
	
		System.out.println("��й�ȣ : ");
		char[] pwc = con.readPassword();
		String pw = new String(pwc); // ���ڹ迭�� ���ڿ��� ����ȯ
		
		
		Person a = new Person(name,point,weight);
		System.out.println(a.toString());
		
	}
	

}
//Console ���� Scanner�� ������ �̿��Ѵ�. why => Console���� ��Ⱑ ����.