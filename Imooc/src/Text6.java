public class Text6 {
		 // ���徲̬����score1
	    static int score1 = 86;
	    // ���徲̬����score2
		static  int score2 = 92; 
	    // ���徲̬����sum������ɼ��ܷ֣��������ܷ�
		public static    int sum() { 			
			return (Text6.score1+Text6.score2);
		}
		public static void main(String[] args) {     
	        // ���þ�̬����sum�����շ���ֵ
			int allScore =Text6.sum();   
			System.out.println("�ܷ֣�" + allScore);
		}
}