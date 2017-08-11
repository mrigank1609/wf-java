package lib.demo;

public class WrapperDemo {

	public static void main(String[] args) {
		int x=10;
		Integer a= new Integer(x); //Boxing
		int y= a.intValue();	//UnBoxing
		
		Integer b=x;
		
		int z=b;
		
		int[] nums={2,8,2,4,5,7,9,22,33,55,21,34};
		int max=0;
		for(int i=0;i<nums.length;i++){
			max=Math.max(max, nums[i]);
		}
		System.out.println("Max is "+max);
		

	}

}
