package sec2;

public class DatabaseEx1 {

	public static void main(String[] args) {
		Database db;	//°´Ã¼ ¼±¾ð
		
		System.out.println("\nOracle");
		db = new Oracle();
		db.connect(null, null, null, null);
		db.select(null, null);
		db.insert(null, null, 0);
		
		System.out.println("\nMySQL");
		
		db = new Mysql();
		db.connect(null, null, null, null);
		db.select(null, null);
		db.insert(null, null, 0);
		
		System.out.println("\nMariaDB");
		
		db = new MariaDB();
		db.connect(null, null, null, null);
		db.select(null, null);
		db.insert(null, null, 0);
		
	}

}
