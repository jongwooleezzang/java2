package sec4;

public class ClassEx {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	 //Person p1 = new Person();
	 Person p1 = new Person("이종우",31);
	 System.out.println("클래스명 : "+p1.getClass().getName());
	 
	 Class<Person> p2 = Person.class;
			 System.out.println("클래스명 :" +p2.getName());
			 
	 Class p3 =Class.forName("sec4.Person");
	 System.out.println("클래스명 : "+p3.getName());
	 
	 Person p4 =(Person) p3.newInstance();
	 p4.setName("이종우");
	 p4.setAge(31);
	 System.out.println("인스턴스 정보 : "+p4);
	 System.out.println("인스턴스 정보 : "+p4.toString());
	 
			
		 
 	}
}
