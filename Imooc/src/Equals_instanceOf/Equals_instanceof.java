package Equals_instanceOf;

public class Equals_instanceof {
	public static void main (String[] args){
		Phone1 phone1=new Phone1();
		Phone2 phone2=new Phone2();
		if(phone1.equals(phone2)){
			System.out.println("����һ��");
		}else{
			System.out.println("���߲�ͬ");
		}
	}
}
