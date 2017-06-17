package java3;

public class HelloWorld2 {
	public static void main(String[] args) {
		// 创建一个空的StringBuilder对象
		StringBuilder str = new StringBuilder();
        
		// 追加字符串
		str.append("jaewkjldfxmopzdm");
		
        // 从后往前每隔三位插入逗号
		for(int i=str.length();i>0;i--){
			if(i==str.length())
				continue;
			else if(i%3==1){
				str.insert(i, '.');
			}
		}
		//for(int i=str.length()-3;i>=0;i=i-3),代码改进
        // 将StringBuilder对象转换为String对象并输出
		System.out.print(str.toString());
	}
}
