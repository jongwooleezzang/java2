package sec3;
//PMD : �ڵ� �ν���� ���� =>�ҽ� �ڵ� ���� :���ɰ���, �ڵ��ۼ���Ģ �ؼ� , �����߻� ���ɼ� �ּ�ȭ�ϱ� ���� �ҽ� �ڵ� ���� �۾�
//Code Inspection Level
//name			Symbol		Level			Comment
//Blocker		������		High			�ʼ�, ���� �߻� ���ɼ��� �ſ� ���ų� �޸� ������ �߻��Ǵ� �ڵ�
//Critical		�þ�(�ϴ�)		Medium High		�ǰ� �� , �����߻� ���ɼ��� ���ų� �Ϲ������� �����Ǿ�� �ϴ� �ڵ�
//Urgent		�ʷ�			Medium			(Major) �ǰ� ��, ���� �߻��� �ְų� ������ �ǰ��ϴ� �߿�
//Important		����Ÿ		Medium Low      (Mino)  �ҽ��ڵ��� ������ ���� ������ ����� ���� ������ �ǰ�
//Warning  		�Ķ�			Low 			(Info) ���������� �����Ǵ� ���� �������� �����ڰ� �����Ͽ�
public class CodeInspectorEx {

	public static void main(String[] args) {
		Reader r1 = new Reader();
		Reader r2 = new Reader(2,"http://www.naver.com","���̹�����Ʈ",1);
		r1.def="���� ������ ";
		//System.out.println(r2.toString());
		//System.out.println(r2.def);
		
	}

}
