package 第五次实验;

public class CPhone extends CTellPhone implements IPlayGame{
	@Override
	public void Call() {
		// TODO Auto-generated method stub
		System.out.println("手机可以打电话");
	}
	@Override
	public void Message() {
		// TODO Auto-generated method stub
		System.out.println("手机可以发信息");
	}
	@Override
	public void PlayGame() {
		// TODO Auto-generated method stub
		System.out.println("手机可以玩游戏");
	}
}
