package sec5;
//����Ŭ����
import java.util.ArrayList;

public class Shelf {
	//ArrayList<String> => "kkt" ,"park","kim","","".....
	protected ArrayList<String> shelf;
	public Shelf () {
		shelf = new ArrayList<String>();
	}
	public ArrayList<String> getShelf() {
		return shelf;
	}
	public int getCount( ) {
		return shelf.size();
	}
}
