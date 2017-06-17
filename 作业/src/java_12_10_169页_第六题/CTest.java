package java_12_10_169页_第六题;


public class CTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java 技术学习班20070326";
		System.out.println(str.subSequence(9, 17));
		String str1="MLDN JAVA";
		String str2= str1.replace("JAVA","J2EE");
		System.out.println(str2);
		str=str.replace("0", "");
		System.out.println(str);
		String str3="Java 技术学习班 20070326 MLDN 老师";
		str3=str3.replace(" ", "");
		System.out.println(str3);
	}
}
