package sec1;

public abstract class User {//�߻� Ŭ����: ���ϳ��� �޼ҵ�� �߻�ȭ �޼ҵ尡 ����.
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
	public abstract void connect();  //�߻� Ŭ������ ���ϴ� abstract �� Ŭ�����տ��ִ´� //�߻�޼ҵ�: �޼ҵ��� ��� ���� ������ ��������ʰ� ������
	
	@Override
	public String toString() {
		return "User [ip=" + ip + ", port=" + port + "]";
	}
	
	
}
