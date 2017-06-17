package 练习;

public class CTest {

	public static void main(String[] args) {
		Parent parent=new Parent();
		parent.setStrName("家长");
		parent.setnAge(30);
		parent.setStrSex("男");
		parent.setStrUnit("单位");
		System.out.println("家长信息："+parent.strName+parent.nAge+parent.strSex+parent.getStrUnit());
		Child child=new Child();
		child.setStrName("学生");
		child.setnAge(19);
		child.setStrSex("男");
		child.setStrUnit("学校");
		System.out.println("学生信息："+child.strName+child.nAge+child.strSex+child.getStrUnit());
	}

}
