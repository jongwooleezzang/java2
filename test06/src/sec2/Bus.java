package sec2;

public class Bus {
	int no; //�뼱��ȣ
	int cnt; //�°���
	int money; //������� 
	
	

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	//��ü ������ �뼱��ȣ(no)�� �Է¹޴� ������ �Լ�
		public Bus(int num) {
			this.no =num;
	}
    //�°��� ������ Ÿ�� �������� ��
		public void take(int money) {
			this.money += money;
			cnt++;
			
	}
	//������ ���� ���� ���
	public void show() {
		System.out.printf("������ȣ:"+this.no ,"���Աݾ�:"+this.money,"�°���"+this.cnt);
	}
}
