package ѧ������ϵͳ;

public class CStudent {
	public String strName;
	public int nAge;
	public String charSex;
	public double dGoal;

	public void printInfo(){                                           //��ѯ
		System.out.println("ѧ����Ϣ��");
		System.out.println("������"+strName);
		System.out.println("���䣺"+nAge);
		System.out.println("�Ա�"+charSex);
		System.out.println("�ɼ���"+dGoal);
	}
	public String toString(){
		return "ѧ����Ϣ��"+"\n"+"������"+strName+"\n"+"���䣺"+nAge+"\n"+"�Ա�"+charSex+"\n"+"�ɼ���"+dGoal+"\n";
	}
	
//	public void Plus(){                                                        //���
//		CStudent student=new CStudent();
//		System.out.println("����ѧ����������\n");
//		student.setStrName(strName);
//		System.out.println("����ѧ�������䣺\n");
//		student.setnAge(nAge);
//		System.out.println("����ѧ�����Ա�\n");
//		student.setCharSex(charSex);
//		System.out.println("����ѧ���ĳɼ���\n");
//		student.setdGoal(dGoal);
//	}
}
