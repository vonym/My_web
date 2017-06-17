package 学生管理系统;

import java.util.Scanner;

public class CTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("**********学生信息管理系统***********");
		System.out.println("**********0退出***********");
		System.out.println("**********1添加***********");
		System.out.println("**********2查询***********");
		System.out.println("**********3修改***********");
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
					//添加
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
						System.out.println("输入第"+(i+1)+"个学生的姓名：");
						student[i].strName=reader.next();
						System.out.println("输入学生"+student[i].strName+"的年龄：");
						student[i].nAge=reader.nextInt();
						System.out.println("输入学生"+student[i].strName+"的性别：");
						student[i].charSex=reader.next();
						System.out.println("输入学生"+student[i].strName+"的成绩：");
						student[i].dGoal=reader.nextDouble();
					}
					break;
					case 2:
						//查询
						for (CStudent cStudent : student) {
							System.out.println(cStudent);
						}
//						for (CStudent cStudent : student) {
//							cStudent.printInfo();
//						}
						break;
					case 3:
							//修改
						System.out.println("输入要更改学生的编号：（1或2）");
						int j=reader.nextInt();
						System.out.println("输入学生的姓名：");
						student[j-1].strName=reader.next();
						System.out.println("输入学生的年龄：");
						student[j-1].nAge=reader.nextInt();
						System.out.println("输入学生的性别：");
						student[j-1].charSex=reader.next();
						System.out.println("输入学生的成绩：");
						student[j-1].dGoal=reader.nextDouble();
						break;
			}
		}
	}
}
