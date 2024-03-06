package sec2;

public class Subway {
	int no;
	String Station;
	int money;
	int cnt; //�°���
	
	//����ö �뼱 ��ȣ�� �Ű������� �޴� ������ �Լ�
	public Subway(int num) {
		this.no =num;
	}
	
	//����ö �°��� ž���ϸ�, ����� �ʵ��� �� ��ȯ
	public void take(int money) {
		this.money += money;
		cnt++;
	}
	
	//���� ����ö ���� ���
	public void show() {
		System.out.println("�뼱��ȣ :"+this.no+"\n���Աݾ� :"+this.money+"\n�°��� :"+this.cnt);
	}

	//getter,setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getStation() {
		return Station;
	}

	public void setStation(String station) {
		Station = station;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	//�л��� ������ Ÿ�� ���������
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	//�л��� ����ö�� Ÿ�� ����� ����
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -=1500;
	}

	
	public void toString() {
		System.out.println("Subway [no=" + no + ", Station=" + Station + ", money=" + money + ", cnt=" + cnt + "]"); 
	}
	
}