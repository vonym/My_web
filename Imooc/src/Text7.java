
public class Text7 {
	String name;
	String sex;
	static int age;
	public Text7(){
		System.out.println("ͨ�����췽����ʼ��name");
	    name ="tom";
	}
	{
		System.out.println("ͨ����ʼ�����ʼ��sex");
		sex="��";
	}
	static {
		System.out.println("ͨ����ʼ�����ʼ��age");
		age=20;
	}
	public void show(){
		System.out.println("����"+name+"���Ա�"+sex+"������"+age);
	}
	public static void main(String[] srgs){
		Text7 text7=new Text7();
		text7.show();
	}
}
