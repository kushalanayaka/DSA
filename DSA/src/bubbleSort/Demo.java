package bubbleSort;

public class Demo {
	public static void main(String args[]) {
		
		int nums[] = {7,4,5,8,2};
		int size = nums.length;
		int temp;
		System.out.println(size);
		System.out.println("Before sorting.");
		for(Integer num : nums) {
			System.out.print(num + " ");
		}

		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size - i - 1; j++) {
				if(nums[j] > nums[j + 1]) {		
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
			System.out.println();
//			System.out.println("After sorting.");
			for(Integer num : nums) {
				System.out.print(num + " ");
			}
		}
		
		System.out.println();
		System.out.println("After sorting.");
		for(Integer num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("The second largest element is : "+ nums[3]);

		}

}
