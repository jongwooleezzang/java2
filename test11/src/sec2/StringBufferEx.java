package sec2;

public class StringBufferEx {

	public static void main(String[] args) {
		String str = new String("Java Programmer");
		str +=" Junien Level ";
		str +="Develope ";
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer(""); //����(stack) ����
		byte[] b = str.getBytes();
		for(byte c:b) {//���ڹ迭�� ���ڿ��� ����
			char k = (char) c;
			sb.append(k);//�ѹ��ھ� �� 
			}
		System.out.println(sb);
		
		CharStack  cs=new CharStack();
		
		cs.push('V');
		cs.push('I');
		cs.push('C');
		cs.push('T');
		cs.push('O');
		cs.push('R');
		cs.push('Y');
		
		System.out.println(cs.list()+", ���ڼ� : "+cs.list().length);//���ڹ迭��
		System.out.println(cs.toString()+", ���ڼ� : "+cs.toSring().length() );//���ڿ�
		
	}
	
	
	
	
	

}
