package sec3;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//reduce() Ȱ���ϱ� 
//���� : ���� ���ڿ� (String)�� �迭���� ���� ���� ���� ����(������ ���� ����ū) ���ڿ��� ã�� ��ȯ�ϴ�  ���α׷��� �ۼ�
//BinaryOperator : ���ڵ� ���ڵ� ��� 2������ ��ȯ�Ͽ� ���ϰų� ó���ϰ��� �Ҷ� Ȱ��Ǵ� �������̽�
class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String s1, String s2) {
	    if(s1.getBytes().length >=s2.getBytes().length)
		return s1; 
	    else return s2;
	}
	
}

public class StreamEx3 {
	public static void main(String[] args) {
		String[] arr = {"����ѹ�","�ź��̿͵η��","��õ���ڵ����","���ع���","Kim"};
		System.out.println(Arrays.stream(arr).reduce("", ( s1, s2 )->{
			if (s1.getBytes().length >=s2.getBytes().length) {
				return s1;} 
		    else {
		    return s2;
		    }
		}));
		System.out.println("BinaryOperator�� Ȱ���� reduce");
		String res =Arrays.stream(arr).reduce(new CompareString()).get();
		System.out.println(res);
		 
		
	}

}
