package 练习;

public class CTest {
	/*
	 * 内部类
	 * 外部类.内部类 对象名称=外部类实例.内部类实例
	 */
	public void fun(){}
	public class MyInner{
		/*
		 * 内部类中不能创建静态方法
		 */
		public void fun(){}
	}
	
	//匿名内部类
	/*实例化后紧接大括号里面写具体的方法实现
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
		 * 异常处理
		 */
		int i=0;
		int j=9;
		try {
			System.out.println(j/i);
			System.out.println("...............");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("程序执行中。。");
		}finally{
			System.out.println("程序结束！");
		}
		
	}

}

