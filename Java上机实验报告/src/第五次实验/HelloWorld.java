package 第五次实验;

public class HelloWorld {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CTellPhone cTellPhone=new CPhone();
		cTellPhone.Call();
		cTellPhone.Message();
		CPhone cPhone=new CPhone();
		cPhone.Call();
		cPhone.Message();
		cPhone.PlayGame();
	}
}
