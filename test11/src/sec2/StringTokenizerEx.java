package sec2;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String names ="���ι�,��ξ�,��μ�,������,�̿���,�̿���";//���б�ȣ(delim)�� ��ū�̶�� ��.
		String anis  ="���ǻ���\f ���ǻ��� \n ���ǻ���\t ���ǻ��� \r ���ǻ���";
		System.out.println(anis);
		//��� ���� ���ڿ� ���� ���� ��ū�� �������� �ʾƵ� �ڵ����� ��ū���� ����
		StringTokenizer st = new StringTokenizer(anis);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
		//Ư�����ڰ� ��ū�� ���
		StringTokenizer sk = new StringTokenizer(names, ",");
		while(sk.hasMoreTokens()) {
			System.out.println(sk.nextToken().trim());
		}
		
	}
}
