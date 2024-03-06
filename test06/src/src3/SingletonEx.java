package src3;

public class SingletonEx {

	public static void main(String[] args) {
		Singleton ins1 = Singleton.getIIsntance();
		Singleton ins2 = Singleton.getIIsntance();
		Singleton ins3 = Singleton.getIIsntance();
		System.out.println(ins1);
		System.out.println(ins2);
		System.out.println(ins3);
		System.out.println((ins1==ins2)+":"+(ins1==ins3));
	}
}
