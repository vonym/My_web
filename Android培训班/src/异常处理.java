
public class 异常处理 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		try {
			String str1=args[0];
			String str2=args[1];
			i=Integer.parseInt(str1);
			j=Integer.parseInt(str2);
			int temp=i/j;
			System.out.println(temp);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("异常");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally{
			System.out.println("结束");
		}
	}

}
