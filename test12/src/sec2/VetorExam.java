package sec2;

import java.util.List;
import java.util.Vector;

public class VetorExam {

	public static void main(String[] args) {
		List<Notice> nVector = new Vector<>();
		//�۾���
		nVector.add(new Notice("����1","����1","������"));
		nVector.add(new Notice("����2","����2","���ٶ�"));
		nVector.add(new Notice("����3","����3","�谡��"));
		nVector.add(new Notice("����4","����4","��ٶ�"));
		nVector.add(new Notice("����5","����5","�̰���"));
		nVector.add(new Notice("����6","����6","�̴ٶ�"));
		
		//�۸��
		System.out.println("����\t����\t�ۼ���");
		for(Notice n:nVector) {//list��ȸ1 (����for��)
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
		nVector.remove(2);//2��°�����
		System.out.println("====������====");	
		Notice no = new Notice("����","����","������");
		nVector.set(4,no); //�߰��� �����ϱ� (�ν��Ͻ� �ε����� 4�ΰ��� ����)
		for(int i=0; i<nVector.size(); i++) {
			Notice n = nVector.get(i);
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
			
		}
		//ArrayList�� ������ ���� �ν��Ͻ��� �޸𸮰� �״�� �����ǰ� ������ Vector�� ������ ������ ,�޸𸮿��� �ڵ����ŵ�(���󵵵�) 
	}

}
