import java.util.Arrays;
public class HelloWorld {
    public static void main(String[] args) {   
         // �������󣬶�����Ϊhello
    	HelloWorld hello = new HelloWorld();       
        // ���÷�����������ֵ�����ڱ�����
		int[] nums = hello.getArray(8);       
        // ������ת��Ϊ�ַ��������
		System.out.println(Arrays.toString(nums)); 
	}
	/*
	 * ���ܣ�����ָ�����ȵ�int�����飬������100���������Ϊ�����е�ÿ��Ԫ�ظ�ֵ
	 * ����һ�����δ�����ֵ�ķ�����ͨ��������������ĳ��ȣ����ظ�ֵ�������
	 */
	public int[] getArray(int length) {
        // ����ָ�����ȵ���������
		int[] nums = new int[length];     
        // ѭ���������鸳ֵ
		for (int i=0;i<length;i++) {         
			// ����һ��100���ڵ������������ֵ�������ÿ����Ա
		 nums[i]=(int) (Math.random ()*100);       
		}
		return nums; // ���ظ�ֵ�������
	}
}