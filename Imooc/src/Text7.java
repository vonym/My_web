
public class Text7 {
	String name;
	String sex;
	static int age;
	public Text7(){
		System.out.println("通过构造方法初始化name");
	    name ="tom";
	}
	{
		System.out.println("通过初始化块初始化sex");
		sex="男";
	}
	static {
		System.out.println("通过初始化块初始化age");
		age=20;
	}
	public void show(){
		System.out.println("姓名"+name+"，性别"+sex+"，年龄"+age);
	}
	public static void main(String[] srgs){
		Text7 text7=new Text7();
		text7.show();
	}
}
