package com.android.cn_1;

import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {
	//ʹ��ʵ��������ʱ���ø�ʽ��ģʽ
	/**
	 * @param args
	 */
	public  static void SimgleFormat(String pattern,double value){
		//ʵ����DecimalFormat����
				DecimalFormat myFormat = new DecimalFormat(pattern);
				String output = myFormat.format(value);
				System.out.println(value+" "+pattern+" "+output);
	}
	//ʹ��applyPattern()���������ֽ��и�ʽ��
	public static void UseApplyPatternMethodFormat(String pattern ,double value){
		DecimalFormat myFormat =new DecimalFormat();
		myFormat.applyPattern(pattern);
		//System.out.println(value��" "+pattern+" "+myFormat.format(value));
	}
	
	public static void main(String[] args) {
		SimgleFormat("###,###.###", 123456.789);
		SimgleFormat("00000000.###kg", 123456.789);
		//���ո�ʽģ���ʽ�����֣������ڵ�λ��0��ʾ
		SimgleFormat("00000000.000", 123.78);
		//���þ�̬UseApplyPatternMethodFormat()����
		UseApplyPatternMethodFormat("#.###%", 0.789);
		//��С������ʽ��Ϊ��λ
		UseApplyPatternMethodFormat("###.##", 123456.789);
		//������ת��Ϊǧ������ʽ
		UseApplyPatternMethodFormat("0.00\u2030", 0.789);
	}
}
