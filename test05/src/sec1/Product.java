package sec1;

public class Product {
    private String pname;
    private int pcode;
    private int size;
    private int amount;
    private String remark;
   //메소드 오버로딩(Method Overload): 매개변수의 타입이나 변수에따라 메소드를 여러개 기술할수있는것(오버라이드와는 별개)
    
    public void print(String pname) {
    	System.out.println("제품이름:"+pname);
    }
    public void print(int amount) {
    	System.out.println("제품수량 : "+amount);
    }
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", pcode=" + pcode + ", size=" + size + ", amount=" + amount + ", remark="
				+ remark + "]";
	}
	
    
}



