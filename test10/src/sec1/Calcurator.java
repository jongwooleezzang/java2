package sec1;
/*
Q1
����(Calcurator)�������̽�
     �ɹ�
    double PI = 3.1415;	
	int ERROR = -999999999;
	int add(int num1,int num2);
	int subtrack(int num1,int num2);
	int multiply(int num1,int num2);
	int divide (int num1,int num2);
	
�߰��(Repeator) �߻� Ŭ���� : Calcurator �� ��ӹ޴� �߻� Ŭ����
	 int add(int num1 int num2):�μ� (num1,nu2)�� ���� ����
	 int subtract(int num1 int num2):�μ� (num1,nu2)�� �E�� ����
	 int power(int num1,int num2):�߻�޼ҵ�
	
�����(ArithmaticEx1) ���� Ŭ���� : Rereator �� ��ӹ��� ���� Ŭ����
   int multiply : (int num1 ,int num2)  
   int divide (int num1 ,int num2)  : �μ� (int num1 ,int num2) �� ������ ����
   int power(int num1 ,int num2)  : num1 num2 �¿����� ���� ���� 
   print():"����, �߰��, ����⸦ �����մϴ�" �����
*/
public interface Calcurator {
	double PI = 3.1415;	//�������̽��� �ʵ带 �����ϸ�, ���(final static)�� �ȴ�.
	int ERROR = -999999999;
	int add(int num1,int num2);
	int subtract(int num1,int num2);
	int multiply(int num1,int num2);
	int divide (int num1,int num2);
}
