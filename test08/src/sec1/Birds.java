package sec1;

public class Birds extends Animal {
	private int wing;
	private boolean fly;
	
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	public boolean isFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	@Override
	public String print() {
		return "Birds wings ["+ wing+" ], name-["+super.getName()+"]";
	}
	
	
}
