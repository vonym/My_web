package ѧ������ϵͳ;

import java.util.Scanner;

public class CTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("**********ѧ����Ϣ����ϵͳ***********");
		System.out.println("**********0�˳�***********");
		System.out.println("**********1���***********");
		System.out.println("**********2��ѯ***********");
		System.out.println("**********3�޸�***********");
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		CStudent[]  student =new CStudent[2];
		int num =-1;
	//	int index=0;
		while (true){
			num= reader.nextInt();
			switch (num) {
			case 0:
				System.exit(0);
				break;
				case 1:
					//���
//					if (index==student.length) {
//						index=0;
//					}else{
//					CStudent student1=new CStudent();
//					student1.strName=reader.next();
//					student1.nAge=reader.nextInt();
//					student1.charSex=reader.next();
//					student1.dGoal=reader.nextDouble();
//					student[index]=student1;
//					index++;}
					for (int i = 0; i < student.length; i++) {
						student[i]=new CStudent();
						System.out.println("�����"+(i+1)+"��ѧ����������");
						student[i].strName=reader.next();
						System.out.println("����ѧ��"+student[i].strName+"�����䣺");
						student[i].nAge=reader.nextInt();
						System.out.println("����ѧ��"+student[i].strName+"���Ա�");
						student[i].charSex=reader.next();
						System.out.println("����ѧ��"+student[i].strName+"�ĳɼ���");
						student[i].dGoal=reader.nextDouble();
					}
					break;
					case 2:
						//��ѯ
						for (CStudent cStudent : student) {
							System.out.println(cStudent);
						}
//						for (CStudent cStudent : student) {
//							cStudent.printInfo();
//						}
						break;
					case 3:
							//�޸�
						System.out.println("����Ҫ����ѧ���ı�ţ���1��2��");
						int j=reader.nextInt();
						System.out.println("����ѧ����������");
						student[j-1].strName=reader.next();
						System.out.println("����ѧ�������䣺");
						student[j-1].nAge=reader.nextInt();
						System.out.println("����ѧ�����Ա�");
						student[j-1].charSex=reader.next();
						System.out.println("����ѧ���ĳɼ���");
						student[j-1].dGoal=reader.nextDouble();
						break;
			}
		}
	}
}
