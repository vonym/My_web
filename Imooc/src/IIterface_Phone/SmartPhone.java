package IIterface_Phone;

public class SmartPhone extends TellPhone implements IPlayGame {

	@Override
	public void Call() {
		// TODO Auto-generated method stub
		System.out.println("����ͨ��");
	}
	public void Message() {
		// TODO Auto-generated method stub
		System.out.println("��������Ϣ");
	}

	public void PlayGaem() {
		// TODO Auto-generated method stub
		System.out.println("�ֻ���������Ϸ");
	}

}
