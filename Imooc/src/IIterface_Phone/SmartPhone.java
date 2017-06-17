package IIterface_Phone;

public class SmartPhone extends TellPhone implements IPlayGame {

	@Override
	public void Call() {
		// TODO Auto-generated method stub
		System.out.println("语音通话");
	}
	public void Message() {
		// TODO Auto-generated method stub
		System.out.println("语音发信息");
	}

	public void PlayGaem() {
		// TODO Auto-generated method stub
		System.out.println("手机可以玩游戏");
	}

}
