package ��ϰ;

public class CTest {

	public static void main(String[] args) {
		Parent parent=new Parent();
		parent.setStrName("�ҳ�");
		parent.setnAge(30);
		parent.setStrSex("��");
		parent.setStrUnit("��λ");
		System.out.println("�ҳ���Ϣ��"+parent.strName+parent.nAge+parent.strSex+parent.getStrUnit());
		Child child=new Child();
		child.setStrName("ѧ��");
		child.setnAge(19);
		child.setStrSex("��");
		child.setStrUnit("ѧУ");
		System.out.println("ѧ����Ϣ��"+child.strName+child.nAge+child.strSex+child.getStrUnit());
	}

}
