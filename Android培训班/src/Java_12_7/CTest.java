package Java_12_7;



public class CTest {

public static void main(String[] args) {
	/*
	 * Thread�Ĵ�����*/
//		Thread thread =new Thread();
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Ʊ����"+i);
//		}
//		thread.start();
	
	//�̳�thread������cthreadʵ���߳�
//	CThread cThread =new CThread();
//	cThread.start();
//	new Thread(new TicketThread(),"�ϲ�").start();
//	new Thread(new TicketThread(),"�Ϻ�").start();
	
	//Thread�Ĵ�����
//		new Thread(){
//		public void run() {
//			System.out.println(this.getName());
//		};
//	}.start();
	
TicketThread ticketThread =new TicketThread();
new Thread(ticketThread,"�ϲ�").start();
new Thread(ticketThread,"�Ϻ�").start();
//	TicketThread ticketThread=new TicketThread();
//	ticketThread.start();
//	TicketThread ticketThread2=new TicketThread();
//	ticketThread2.start();
	}
}