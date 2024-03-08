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
		
		User u1 = new User("이종우",31);
		try {//객체를 json 타입의 파일로 전환
			mapper.writeValue(new File("member.json"),(user));
			//객체를 json 타입의 String 으로 변환
			String jsonUser = mapper.writeValueasString(user);
			System.out.println(jsonUser);
		}catch(JsonGenerationException e) {
			System.out.println("변환실패");
		}
		
		
	}
}
