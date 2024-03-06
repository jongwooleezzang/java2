package sec4;
//다중 상속 안됨
//public class Pay extends Inventory {} >페이클레스에서 인벤토리 클래스를 상송받고 스토어클레스에서 페이클레스를 상속받으면 됨
public class Store extends Pay{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		super.pay();
	}

	@Override
	public void inventory() {
		// TODO Auto-generated method stub
		super.inventory();
	}
	

}
