package sec1;

class StudentMap<K, V>{//Map 구조
	private K key;
	private V value;
	
	public StudentMap (){};
	public StudentMap(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}


	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	
}

public class GenericEx2 {

	public static void main(String[] args) {
		StudentMap<Integer, String> s1 = new StudentMap<>(1,"김기태"); //int 등의 primitive사용불가
		StudentMap<Integer, String> s2 = new StudentMap<>(2,"박성은"); 
		StudentMap<Integer, String> s3 = new StudentMap<>(3,"계성우"); 
		StudentMap<Integer, String> s4 = new StudentMap<>(4,"김동인"); 
		
		StudentMap<String, Integer> s5 = new StudentMap<>("김기태",90); 
		StudentMap<String, Integer> s6 = new StudentMap<>("박은성",10); 

		Student st1 = new Student("김민식",25);
		StudentMap<Student, Integer> s7 = new StudentMap<>(st1,10); 
		StudentMap<String, Integer> s6 = new StudentMap<>("박은성",10); 
		
		
	}

}
