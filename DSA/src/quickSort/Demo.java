package quickSort;

public class Demo {
	
	public static void quickSort(int[] arr, int low , int high) {
		
		if(low < high) {
			
			int pi = partition(arr, low, high);
			
			quickSort(arr, low, pi - 1);
			quickSort(arr,pi + 1, high);
		}
	}
	


	private static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i =low - 1;
		int temp = 0;
		
		for(int j = low; j < high; j++) {
			
			if(arr[j] < pivot) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return  i + 1;
	}



	public static void main(String args[]) {
		
		int arr[] = {4,5,2,9,55,42};
		System.out.println("Before Swapping");
		for(int num: arr) {
			System.out.print(num + " ");
		}
		
		
		quickSort(arr, 0 , arr.length - 1);
		System.out.println();
		System.out.println("After Swapping");
		for(int num: arr) {
			System.out.print(num + " ");
		}
		
	}

	
	
	
}
