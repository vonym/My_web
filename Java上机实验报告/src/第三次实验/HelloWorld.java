package ������ʵ��;

public class HelloWorld {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CPerson cPerson=new CPerson();
		System.out.println(cPerson);
		cPerson.say();
		CChinese cChinese=new CChinese();
		cChinese.strName="����";
		cChinese.charSex='��';
		System.out.println(cChinese);
		cChinese.say();
		CAmerica cAmerica=new CAmerica("Jane", 'Ů');
		System.out.println(cAmerica);
		cAmerica.say();
	}

}
