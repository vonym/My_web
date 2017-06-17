
public class Text1 {

	public static void main(String[] args) {
		int[] nums={61,23,4,74,13,14,8,20};
		int max=nums[0];
		int min=nums[0];
		double sum=0;
		double avg=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>max)
				max=nums[i];
			if(nums[i]<min)
				min=nums[i];
			sum+=nums[i];
			
		}
		avg=sum/nums.length;
System.out.println("max="+max+"min="+min+"sum="+sum+"avg="+avg);	
	}

}
