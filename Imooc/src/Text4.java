
public class Text4 {

	public static void main(String[] args) {
		// ����һ���ַ���
		String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
        
        // ���ִ���
		int num = 0;
        byte[] bt=s.getBytes();
         // ѭ������ÿ���ַ����ж��Ƿ����ַ� a ������ǣ��ۼӴ���
		for (int i=0;i<s.length();i++ )
		{
			
            // ��ȡÿ���ַ����ж��Ƿ����ַ�a
			if (bt[i]=='a'){
                // �ۼ�ͳ�ƴ���
				num++; 
			}
		}
		System.out.println("�ַ�a���ֵĴ�����" + num);
	}
}
