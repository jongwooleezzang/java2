package sec1;

public abstract class User {//추상 클래스: 단하나의 메소드라도 추상화 메소드가 있음.
	protected String ip;
	protected int port;
	//getter,setter
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public abstract void connect();  //추상 클래스를 뜻하는 abstract 를 클래스앞에넣는다 //추상메소드: 메소드의 기능 구현 내용을 기술하지않고 선언만함
	
	@Override
	public String toString() {
		return "User [ip=" + ip + ", port=" + port + "]";
	}
	
	
}
