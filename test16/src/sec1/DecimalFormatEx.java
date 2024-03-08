package sec1;

import java.text.DecimalFormat;

//DecimalFormat : 숫자의 표시형식을 지정하여 활용하는 클래스
public class DecimalFormatEx {

	public static void main(String[] args) {
		//표시형식코드 : 0, #   
		//1234.56 의 숫자인경우 
		//0 => 1234 , 0.0 => 1234.5 , 000000.00000 => 001234.56000
		//# => 1234 , #.# => 1234.5 , ######.##### => 1234.56
		// , =>천단위 구분기호  E =>지수형태  % => 백분율 표시
		//-1234
		//-#, -0 => -1234
		//#- , 0- => 1234-
		//#,##0 => =-1,234
		//#E0 =>1.234E+03  이게뭔데? 몰라도되는듯
		//#% => -1234000%
		
		double n = 1234567.89;
		DecimalFormat df1 = new DecimalFormat("#,##0.0000");
		DecimalFormat df2 = new DecimalFormat("000,000,000.####");
		
		
		String res1 = df1.format(n);
		String res2 = df2.format(n);

		System.out.println(res1);
		System.out.println(res2);
		
		
	}
	

}
