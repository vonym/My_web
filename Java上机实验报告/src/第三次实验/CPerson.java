package 第三次实验;

public class CPerson {
	public String strName;
	public char charSex;
	public CPerson() {
		strName="张三";
		charSex='男';
	}
	public String toString(){
		return "信息：\n"+"姓名："+strName+"\n"+"性别："+charSex;
	}
	public void say(){
		System.out.println("人会说话。");
	}
}
