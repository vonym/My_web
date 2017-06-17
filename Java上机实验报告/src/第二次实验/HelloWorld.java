package 第二次实验;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=3;
		for(int i=0;i<num;i++){
			if (i==1) {
				System.out.println("helloworld"+i);
			} else {
				System.out.println("hello"+i);
				continue;
			}
		}
	}
}
