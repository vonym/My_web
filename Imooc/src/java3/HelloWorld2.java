package java3;

public class HelloWorld2 {
	public static void main(String[] args) {
		// ����һ���յ�StringBuilder����
		StringBuilder str = new StringBuilder();
        
		// ׷���ַ���
		str.append("jaewkjldfxmopzdm");
		
        // �Ӻ���ǰÿ����λ���붺��
		for(int i=str.length();i>0;i--){
			if(i==str.length())
				continue;
			else if(i%3==1){
				str.insert(i, '.');
			}
		}
		//for(int i=str.length()-3;i>=0;i=i-3),����Ľ�
        // ��StringBuilder����ת��ΪString�������
		System.out.print(str.toString());
	}
}
