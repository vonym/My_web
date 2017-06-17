package 实现反转及排序类11_28;

public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array a=null;
		a=new Array(5);
		System.out.println(a.add(23)+"\t");
		System.out.println(a.add(21)+"\t");
		System.out.println(a.add(2)+"\t");
		System.out.println(a.add(42)+"\t");
		System.out.println(a.add(5)+"\t");
		System.out.println(a.add(6)+"\t");
		print (a.getArray());
	}
	public static void print(int i[]){
		for (int x = 0; x < i.length; x++) {
			System.out.println(i[x]+"、");
		}
		
	}
}
