package insertionSort;

public class Demo {

	public static void main(String[] args) {

		int arr[] = { 7,3,4,1,2,9,5,21,8};
		
		int size = arr.length;
		
		System.out.println("Before Sort");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		for(int i = 0; i < size ; i++) {
			
			int key = arr[i];
			int j = i - 1;
			
			while( j >= 0 && arr[j] > key) {
				
				arr[j + 1] = arr[j];
				j--;
			}
			
            arr[j + 1] = key;
		}
		System.out.println(" ");
		System.out.println("After Sort");
		
		
		for(int num : arr) {
			System.out.print(num + " ");
			
		}
		
		
	}

}
