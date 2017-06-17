package Java_12_7;



public class CTest {

public static void main(String[] args) {
	/*
	 * Thread的创建①*/
//		Thread thread =new Thread();
//		for (int i = 0; i < 5; i++) {
//			System.out.println("票数："+i);
//		}
//		thread.start();
	
	//继承thread，子类cthread实现线程
//	CThread cThread =new CThread();
//	cThread.start();
//	new Thread(new TicketThread(),"南昌").start();
//	new Thread(new TicketThread(),"上海").start();
	
	//Thread的创建②
//		new Thread(){
//		public void run() {
//			System.out.println(this.getName());
//		};
//	}.start();
	
TicketThread ticketThread =new TicketThread();
new Thread(ticketThread,"南昌").start();
new Thread(ticketThread,"上海").start();
//	TicketThread ticketThread=new TicketThread();
//	ticketThread.start();
//	TicketThread ticketThread2=new TicketThread();
//	ticketThread2.start();
	}
}