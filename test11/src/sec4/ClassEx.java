package sec4;

public class ClassEx {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	 //Person p1 = new Person();
	 Person p1 = new Person("������",31);
	 System.out.println("Ŭ������ : "+p1.getClass().getName());
	 
	 Class<Person> p2 = Person.class;
			 System.out.println("Ŭ������ :" +p2.getName());
			 
	 Class p3 =Class.forName("sec4.Person");
	 System.out.println("Ŭ������ : "+p3.getName());
	 
	 Person p4 =(Person) p3.newInstance();
	 p4.setName("������");
	 p4.setAge(31);
	 System.out.println("�ν��Ͻ� ���� : "+p4);
	 System.out.println("�ν��Ͻ� ���� : "+p4.toString());
	 
			
		 
 	}
}
