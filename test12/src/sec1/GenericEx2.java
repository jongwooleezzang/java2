package sec1;

class StudentMap<K, V>{//Map ����
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
		StudentMap<Integer, String> s1 = new StudentMap<>(1,"�����"); //int ���� primitive���Ұ�
		StudentMap<Integer, String> s2 = new StudentMap<>(2,"�ڼ���"); 
		StudentMap<Integer, String> s3 = new StudentMap<>(3,"�輺��"); 
		StudentMap<Integer, String> s4 = new StudentMap<>(4,"�赿��"); 
		
		StudentMap<String, Integer> s5 = new StudentMap<>("�����",90); 
		StudentMap<String, Integer> s6 = new StudentMap<>("������",10); 

		Student st1 = new Student("��ν�",25);
		StudentMap<Student, Integer> s7 = new StudentMap<>(st1,10); 
		StudentMap<String, Integer> s6 = new StudentMap<>("������",10); 
		
		
	}

}
