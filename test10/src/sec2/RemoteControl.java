package sec2;

public interface RemoteControl {
	int MAX = 10; //상수
	int MIN = 0;
	//추상 메소드(접근제한자는 public)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	default void setMute(boolean mute){
		if(mute) System.out.println("무음처리");
		else System.out.println("무음 해제");
	}
	static void ChangeBattery() {
		System.out.println("배터리교체");
	}
	//인터페이스에 메소드는 기본이 추상 메소드이므로 선언만 가능하다 실행문 불가 => 접근제한자는 public 이된다.
	/*그러나, 구현내용을 기술하고 싶으면, 기본 접근 제한자 default로 명기하면 된다 
	혹은 static 을 쓰면된다 */
}
