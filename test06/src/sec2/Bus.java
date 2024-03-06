package sec2;

public class Bus {
	int no; //노선번호
	int cnt; //승객수
	int money; //버스요금 
	
	

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
	
	
	
	//객체 생성시 노선번호(no)만 입력받는 생성자 함수
		public Bus(int num) {
			this.no =num;
	}
    //승객이 버스를 타면 행해지는 일
		public void take(int money) {
			this.money += money;
			cnt++;
			
	}
	//버스의 현재 정보 출력
	public void show() {
		System.out.printf("버스번호:"+this.no ,"수입금액:"+this.money,"승객수"+this.cnt);
	}
}
