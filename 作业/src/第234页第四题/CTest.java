package ��234ҳ������;

public class CTest {
	public static void main(String[] args) {
		CStaff cStaff=new CStaff();
		cStaff.printInfo();
		CClerk cClerk=new CClerk();
		cClerk.strName="��ɺ";
		cClerk.nAge=20;
		cClerk.charSex='Ů';
		cClerk.setStrDepartment("����");
		cClerk.setnWage(3000);
		cClerk.printInfo();
		CManagement cManagement =new CManagement();
		cManagement.strName="����";
		cManagement.nAge=30;
		cManagement.charSex='��';
		cManagement.setStrJob("��Ŀ����");
		cManagement.setnAnnualPension(1000000);
		cManagement.printInfo();
	}
}
