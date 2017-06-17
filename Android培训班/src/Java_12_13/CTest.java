package Java_12_13;

public class CTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 静态块 优先于 代码块 优先于 构造块 优先于 成员方法 
		 * 接口允许多继承 接口 extends 接口1，接口2，···
		 * 向上转型：将子类实例化后赋值给父类
		 */

		CCompany cCompany = new CCompany();
		cCompany.getClassName();
	}

}
