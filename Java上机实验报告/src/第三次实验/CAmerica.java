package 第三次实验;

public class CAmerica extends CPerson{

	public CAmerica(String strName, char charSex) {
		this.strName=strName;
		this.charSex=charSex;
	}
@Override
public void say() {
	super.say();
	System.out.println("美国人说英语。");
	}
}
