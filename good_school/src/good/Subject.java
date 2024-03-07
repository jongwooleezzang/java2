package good;

public class Subject {
 private int code;
 private String type;
 private String sname;
 
public Subject() {}
public Subject(int code, String type, String sname) {
	super();
	this.code = code;
	this.type = type;
	this.sname = sname;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
@Override
public String toString() {
	return "Subject [code=" + code + ", type=" + type + ", sname=" + sname + "]";
}
 
 
}
