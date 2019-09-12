package sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("How many element do you want to sort ?");
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter "+ i+1 + " element");
			arr = sort(arr, sc.nextInt());
			print(arr);
		}
		
		
	}
	
	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
	}

	public static int[] sort(int[] arr, int input) {
		if (arr.length > 1 && arr[arr.length-1] <= input) {
			arr[arr.length] = input;
			return arr;
		}
		for (int i = arr.length-1; i > 0; i--) {
			if (input < arr[i] && input >= arr[i-1]) {
				arr[i+1] = arr[i];
				arr[i] = input;
			} else {
				arr[i+1] = arr[i];
				arr[i] = arr[i-1];
			}
		}
		return arr;
	}

}
