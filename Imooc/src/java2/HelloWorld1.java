package java2;

public class HelloWorld1 {
	  private String name = "��Ľ��";
	    // �ⲿ���е�show����
	    public void show() { 
			// ���巽���ڲ���
			class MInner {
				int score = 83;
				public int getScore() {
					return score + 10;
				}
			}
			// ���������ڲ���Ķ���
	        MInner newscore=new MInner();
	        // �����ڲ���ķ���
	        int newScore=newscore.getScore();
			System.out.println("������" + name + "\n�ӷֺ�ĳɼ���" + newScore);
		}
		// ���Է����ڲ���
		public static void main(String[] args) {
			// �����ⲿ��Ķ���
	        HelloWorld1 mo=new HelloWorld1();
	        // �����ⲿ��ķ���
			 mo. show();
		}
}
