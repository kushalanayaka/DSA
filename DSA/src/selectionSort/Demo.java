package selectionSort;

public class Demo {

	public static void main(String[] args) {
				
		
		System.out.println('A' + 'B'); //131
				int nums[] = {7,4,5,11,8,2};
				int size = nums.length;
				int temp = 0;
				int minIndex = -1;
				System.out.println(size);
				System.out.println("Before sorting.");
				for(Integer num : nums) {
					System.out.print(num + " ");
				}

				for(int i = 0; i < size ; i++) {
					minIndex = i;
					for(int j = i + 1; j <size; j++) {
						if(nums[minIndex] > nums[j]) {
							minIndex = j;
						}
					}
					
					temp = nums[minIndex];
					nums[minIndex] = nums[i];
					nums[i] = temp;
				}
				
				System.out.println();
				System.out.println("After sorting.");
				for(Integer num : nums) {
					System.out.print(num + " ");
				}
				System.out.println();
//				System.out.println("The second largest element is : "+ nums[3]);

				}

}
