package ��ϰ;

public class CTest {
	/*
	 * �ڲ���
	 * �ⲿ��.�ڲ��� ��������=�ⲿ��ʵ��.�ڲ���ʵ��
	 */
	public void fun(){}
	public class MyInner{
		/*
		 * �ڲ����в��ܴ�����̬����
		 */
		public void fun(){}
	}
	
	//�����ڲ���
	/*ʵ��������Ӵ���������д����ķ���ʵ��
	 * new CTest{
	 * 		public void fun(){
	 * 			system.out.println("*******");
	 * 		}
	 * }
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest.MyInner myInner=new CTest().new MyInner();
		myInner.fun();
		/*
		 * �쳣����
		 */
		int i=0;
		int j=9;
		try {
			System.out.println(j/i);
			System.out.println("...............");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����ִ���С���");
		}finally{
			System.out.println("���������");
		}
		
	}

}

