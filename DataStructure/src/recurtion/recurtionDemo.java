package recurtion;

public class recurtionDemo {

	public static void main(String[] args) {
		int arr[] = {5, 6, 7, 23, 54, 12, 34, 98, 65, 54};

		divide(arr, 0, arr.length);
	}

	private static void divide(int[] arr, int start, int end) {
		
		if(end - start > 1) {
			print(arr);
			divide(arr, 0, (end/2)-1);
			divide(arr, (end/2-1), end);
		} else {
			
		}
	}

	private static void print(int[] arr) {
		for (int num: arr) {
			System.out.print(num +" ");
		}
		System.out.println();
	}

}
