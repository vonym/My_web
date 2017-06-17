package 实现反转及排序类11_28;

public class Array {
	private int temp[];
	private int foot;
	public Array(int len){
		if (len>0) {
			this.temp=new int [len];
		}else{
			this .temp=new int[1];
		}
	}
	public boolean add(int i){
		if (this.foot<this.temp.length) {
			this.temp[foot]=i;
			foot++;
			return true;
		}else{
			return false;
		}
	}
	public int[] getArray(){
		return this.temp;
	}
}
