package linearSearch;

public class Demo {

	public static void main(String[] args) {

		int nums[] = {2,4,6,8,99};
		int target = 2;
		
//		System.out.println(nums.length - 1); checking 

		int result  = linearSearch(nums, target);
		
		if(result != result-1) {
			System.out.println("Target found at index : "+result);
		}
		else {
			System.out.println("Target not found");
		}
	}

	public static int linearSearch(int[] nums, int target) {
		
		for(int i =0 ; i < nums.length; i++) {
//			System.out.println(nums[nums.length - 1]); 
			if(nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
