package 第三次实验;

public class HelloWorld {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CPerson cPerson=new CPerson();
		System.out.println(cPerson);
		cPerson.say();
		CChinese cChinese=new CChinese();
		cChinese.strName="李四";
		cChinese.charSex='男';
		System.out.println(cChinese);
		cChinese.say();
		CAmerica cAmerica=new CAmerica("Jane", '女');
		System.out.println(cAmerica);
		cAmerica.say();
	}

}
