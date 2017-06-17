package 学生管理系统;

public class CStudent {
	public String strName;
	public int nAge;
	public String charSex;
	public double dGoal;

	public void printInfo(){                                           //查询
		System.out.println("学生信息：");
		System.out.println("姓名："+strName);
		System.out.println("年龄："+nAge);
		System.out.println("性别："+charSex);
		System.out.println("成绩："+dGoal);
	}
	public String toString(){
		return "学生信息："+"\n"+"姓名："+strName+"\n"+"年龄："+nAge+"\n"+"性别："+charSex+"\n"+"成绩："+dGoal+"\n";
	}
	
//	public void Plus(){                                                        //添加
//		CStudent student=new CStudent();
//		System.out.println("输入学生的姓名：\n");
//		student.setStrName(strName);
//		System.out.println("输入学生的年龄：\n");
//		student.setnAge(nAge);
//		System.out.println("输入学生的性别：\n");
//		student.setCharSex(charSex);
//		System.out.println("输入学生的成绩：\n");
//		student.setdGoal(dGoal);
//	}
}
