package sec2;

public class Subway {
	int no;
	String Station;
	int money;
	int cnt; //승객수
	
	//지하철 노선 번호를 매개변수로 받는 생성자 함수
	public Subway(int num) {
		this.no =num;
	}
	
	//지하철 승객이 탑승하면, 생기는 필드의 값 변환
	public void take(int money) {
		this.money += money;
		cnt++;
	}
	
	//현재 지하철 정보 출력
	public void show() {
		System.out.println("노선번호 :"+this.no+"\n수입금액 :"+this.money+"\n승객수 :"+this.cnt);
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
	//학생이 버스를 타면 생기는현상
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	//학생이 지하철을 타면 생기는 현상
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -=1500;
	}

	
	public void toString() {
		System.out.println("Subway [no=" + no + ", Station=" + Station + ", money=" + money + ", cnt=" + cnt + "]"); 
	}
	
}