package sec2;

public interface RemoteControl {
	int MAX = 10; //���
	int MIN = 0;
	//�߻� �޼ҵ�(���������ڴ� public)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	default void setMute(boolean mute){
		if(mute) System.out.println("����ó��");
		else System.out.println("���� ����");
	}
	static void ChangeBattery() {
		System.out.println("���͸���ü");
	}
	//�������̽��� �޼ҵ�� �⺻�� �߻� �޼ҵ��̹Ƿ� ���� �����ϴ� ���๮ �Ұ� => ���������ڴ� public �̵ȴ�.
	/*�׷���, ���������� ����ϰ� ������, �⺻ ���� ������ default�� ����ϸ� �ȴ� 
	Ȥ�� static �� ����ȴ� */
}
