package 第234页第四题;

public class CTest {
	public static void main(String[] args) {
		CStaff cStaff=new CStaff();
		cStaff.printInfo();
		CClerk cClerk=new CClerk();
		cClerk.strName="张珊";
		cClerk.nAge=20;
		cClerk.charSex='女';
		cClerk.setStrDepartment("后勤");
		cClerk.setnWage(3000);
		cClerk.printInfo();
		CManagement cManagement =new CManagement();
		cManagement.strName="李四";
		cManagement.nAge=30;
		cManagement.charSex='男';
		cManagement.setStrJob("项目经理");
		cManagement.setnAnnualPension(1000000);
		cManagement.printInfo();
	}
}
