package sec1;
//���ʸ�(Generic)�̶�? �����Ϳ� ������� �ƹ��ų� ��� �޾Ƽ� ó���ϴ� Ŭ����
//���� ����ϴ� Ÿ�� ����: T(Type) , E(Element), K(Key) , V(value) ,N(Number), R(Result)
//<> : ���̾Ƹ�� ������
public class Generic1<T> {
	private T field1;

	public Generic1(T field1) {
		super();
		this.field1 = field1;
	}

	public T getField1() {
		return field1;
	}

	public void setField1(T field1) {
		this.field1 = field1;
	}
	
	
}
