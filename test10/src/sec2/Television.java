package sec2;

public class Television implements Screen {
	int volume;
	int lightness;
	int zoom;
	
	@Override
	public void turnOn() {
		System.out.println("전원 on");
	}

	@Override
	public void turnOff() {
		System.out.println("전원 on");
	}

	@Override
	public void setVolume(int volume) {
		if (volume >MAX) {
			this.volume = RemoteControl.MAX;
		} else if(volume<MIN) {
			this.volume =RemoteControl.MIN;
		} else {
			this.volume = volume ;
		}
	}

	@Override
	public int light() {
		return 0;
	}

	@Override
	public int dark() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int zoomin() {
		System.out.println("50% 축소");
		if(zoom>= -500 && zoom<= 500) {
		 zoom+=50;
		}
	}

	@Override
	public int zoomout() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
