public class Text6 {
		 // 定义静态变量score1
	    static int score1 = 86;
	    // 定义静态变量score2
		static  int score2 = 92; 
	    // 定义静态方法sum，计算成绩总分，并返回总分
		public static    int sum() { 			
			return (Text6.score1+Text6.score2);
		}
		public static void main(String[] args) {     
	        // 调用静态方法sum并接收返回值
			int allScore =Text6.sum();   
			System.out.println("总分：" + allScore);
		}
}