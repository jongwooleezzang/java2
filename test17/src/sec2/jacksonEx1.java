package sec2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
class User{
	private String name;
	private int age;
	
	public User() {}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class jacksonEx1 {
	public static void main (String[] args) throws IOException{
		ObjectMapper mapper = new ObjectMapper();
		
		User u1 = new User("������",31);
		try {//��ü�� json Ÿ���� ���Ϸ� ��ȯ
			mapper.writeValue(new File("member.json"),(user));
			//��ü�� json Ÿ���� String ���� ��ȯ
			String jsonUser = mapper.writeValueasString(user);
			System.out.println(jsonUser);
		}catch(JsonGenerationException e) {
			System.out.println("��ȯ����");
		}
		
		
	}
}
