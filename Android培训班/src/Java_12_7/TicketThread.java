package Java_12_7;

public class TicketThread implements Runnable{
	private int i=5;
	private String temp ;
	@Override
	public void run() {
		for (; i >0; i--) {
			temp=Thread.currentThread().getName();
			System.out.println("Ʊ�㣺"+temp+"\nƱ����"+i);
		}
	}
}
