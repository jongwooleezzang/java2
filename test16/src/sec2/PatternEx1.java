package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern : Ư�� �����Ͱ� ������ �´´� ���Ϸ��� �� ���  ������ ������ �����ϴ� Ŭ���� 
//Matcher : Ư�� ������ ���°� �´��� ���ϴ� Ŭ���� 
//���Խ�(Reg Expression) => RegEx
public class PatternEx1 {
	public static void main(String[] args) {
		String[] dt = {"bag","kim1004","9 to 6","8 to 5","Single","Mom","ABC","�����","^*^","123123"};
		//Pattern p = Pattern.compile("[a-z]*"); //���� �ҹ��ڷθ� �����ȵ�����
		//Pattern p = Pattern.compile("S[A-Z a-z]*"); //s�� �����ϸ鼭 ���� ��ҹ��ڷ� ������ ������
		//Pattern p = Pattern.compile("[��-�R]*"); //s�� �����ϸ鼭 ���� ��ҹ��ڷ� ������ ������
		//Pattern p = Pattern.compile("[e]$*"); //Ư�� ���ڷ� ������ ���$  �ȳ���
		//Pattern p = Pattern.compile("^b"); //Ư�� ���ڷ� �����ϴ°��		�ȳ���
		  Pattern p = Pattern.compile("[0-9]*"); //��簪�� ������ ������  ???????^���̰� ����???????????????
		for(int i=0 ; i<dt.length; i++) {
			Matcher m = p.matcher(dt[i]);
			if(m.matches()) {
				System.out.println("���� ��ġ :"+dt[i]);
				
			}
		}
	}
}
