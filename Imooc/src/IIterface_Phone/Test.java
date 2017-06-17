package IIterface_Phone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TellPhone tel1=new CellPhone();
		tel1.Call();
		tel1.Message();
		SmartPhone tel2=new SmartPhone();
		tel2.Call();
		tel2.Message();
		tel2.PlayGaem();
		Psp psp=new Psp();
		psp.PlayGaem();
	}

}
