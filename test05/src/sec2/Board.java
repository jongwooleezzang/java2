package sec2;
//생성자함수
//생성자 오버로드 : 반환타입이 없음
public class Board {
	private int bno;
	private String title;
	private String uname;
	private String resdate;
	private String content;
	//생성자 함수:sorse-generlate contructol super 은 지워도됨

	//기본형 default
	public Board() { }
	
	//생성자 함수(객채1)
	public Board(int bno) {
		this.bno = bno;
	}
	//생성자 함수(객체2)
	public Board(int bno, String title) {
		this.bno = bno;
		this.title = title;
	}
	//생상자 함수(객체3)
	public Board(int bno, String title, String uname) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
	}
	//생성자 함수(객체4)
	public Board(int bno, String title, String uname, String resdate) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.resdate = resdate;
	}
	//생성자 함수(객체5)

	public Board(int bno, String title, String uname, String resdate, String content) {
		super();
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.resdate = resdate;
		this.content = content;
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

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getResdate() {
		return resdate;
	}

	public void setResdate(String resdate) {
		this.resdate = resdate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", uname=" + uname + ", resdate=" + resdate + ", content="
				+ content + "]";
	}
    
    
}

