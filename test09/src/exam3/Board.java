package exam3;
/* Q3
    �Խ���(Board) Ŭ���� �ۼ�
	�ش� ��Ű�� : exam03
	���� Ŭ������(main �Լ� ����) : BoardExam
	�Ϲ� Ŭ������ : Board
	��� �ʵ� : �۹�ȣ(bno), ����(title), �ۼ���(uname), �۳���(content), �ۼ���
	(resdate), ����Ƚ��(visited) 
	�� ��� �ʵ�� ���� ������ ���� �ʵ��� �ؾ� �ϸ�, ������ ������ Ÿ���� ����
	�Ͽ� ���� ������ �� �� �ֵ��� �� ���̸�,
	�׿� ���� getter/setter ���� �ۼ��ϰ�, �⺻ �����ڿ� ��� ��� �ʵ� ���� ��
	�������� �޴� �����ڸ� �ۼ��Ͻÿ�.
	���� Ŭ�������� 6���� ���� �����ǰ�, �̸� ArrayList �Ǵ� �迭�� �����Ͽ� ��
	���ϸ�, 
	�ݵ��, 6���� ���� ��� ��� ȭ��(�ܼ� â)�� ������� ��µ� �� �ֵ��� �� 
	��.
	(board ��ü�� �� ��� �ʵ� ���� ���Ƿ� setter �� �����ϵ�, Ű����� �Է¹޵�
	�������.) */
public class Board {
	int bno;
	String title;
	String uname;
	String content;
	String resdate;
	int visited;
	public Board() {};	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	

}
