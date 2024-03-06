package sec2;

public class Board {

		private int bno;
		private String title;
		private String date;
		private String name;
		private int count;
		
		
		
		public Board() {}
		public Board(int bno, String title, String date, String name, int count) {
			super();
			this.bno = bno;
			this.title = title;
			this.date = date;
			this.name = name;
			this.count = count;
		}
		public int getBno() {
			return bno;
		}
		public void setBno(int bno) {
			this.bno = bno;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		
		
		
	}

}
