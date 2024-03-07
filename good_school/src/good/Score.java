package good;

public class Score {
 private int no;
 private String code;
 private int point;
 private Subject subject;
public Score() {}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public int getPoint() {
	return point;
}
public void setPoint(int point) {
	this.point = point;
}
public Score(int no, String code, int point) {
	super();
	this.no = no;
	this.code = code;
	this.point = point;
}
@Override
public String toString() {
	return "Score [no=" + no + ", code=" + code + ", point=" + point + "]";
}
 
}
