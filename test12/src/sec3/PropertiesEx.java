package sec3;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx {//���߾���

	public static void main(String[] args) {
		//Properties ���� �� ����
		Properties pro = new Properties();
		
		pro.setProperty("job", "developer"); //entry �� ���ϰ� element����� "job" element
		pro.setProperty("name", "�����");
		pro.setProperty("age", "43");
		pro.setProperty("local", "���굿");
		
		System.out.println(pro);
		System.out.println("element�� �� : "+pro.size());
		System.out.println("�������� name :"+pro.getProperty("name"));
		
		//Properties�� ��ȸ =>���������� �ش� ������Ʈ�� Ű(�Ӽ�)�� ������ ó���Ͽ�����
		Enumeration e  =  pro.propertyNames();
		while(e.hasMoreElements()) {
			String el = (String) e.nextElement();
			System.out.println(el+":"+pro.getProperty(el));
			
					
		}
	}

}
