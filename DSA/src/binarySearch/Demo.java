package binarySearch;

public class Demo {

	public static void main(String[] args) {
		
		int nums[] = {10,23,45,56,65,74,84,89,99};
		int target = 99;
		
//		System.out.println(nums[nums.length - 2]);
//		int result = binarySearch(nums, target);
		int result = binarySearch(nums, target, 0 , nums.length - 1);
		if(result  != -1)
		    System.out.println("Target found at index : "+ result);
		else
			System.out.println("Target not found.");
		
	}

	public static int binarySearch(int[] nums, int target, int left , int right) {
		
//		int left = 0;
//		int right = nums.length - 1;
		
//		while(left <= right) {
//			int mid = (left + right)/2;
//
//			if(nums[mid] == target)
//				return mid;
//			else if(nums[mid] < target)
//				left = mid + 1;
//			else
//				right = mid - 1;			
//		}
//		return -1;
		
		//Recursive 
		if(left <= right) {
			int mid = (left + right)/2;
			
			if(nums[mid] == target)
				return mid;
			else if(nums[mid] < target)
				return binarySearch(nums, target, mid + 1, right);
			else
				return binarySearch(nums, target, left, mid - 1);
		}
		return -1;
	}

}