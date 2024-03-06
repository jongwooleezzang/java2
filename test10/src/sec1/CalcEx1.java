package sec1;

public class CalcEx1 {
     
	public static void main(String[] args) {
		int num1 =50;
		int num2 =4;
		Arithmatic a1 = new Arithmatic();
		a1.print();
		System.out.println("¿øÁÖÀ² : "+a1.PI);
		System.out.println("µ¡¼À : "+a1.add(num1, num2));
		System.out.println("»¬¼À : "+a1.subtract(num1, num2));
		System.out.println("°ö¼À : "+a1.multiply(num1, num2));
		System.out.println("³ª´°¼À : "+a1.divide(num1, num2));
		System.out.println("°ÅµìÁ¦°ö : "+a1.power(num1, num2));
	}
}
