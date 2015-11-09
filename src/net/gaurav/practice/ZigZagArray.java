package net.gaurav.practice;

public class ZigZagArray {

	public static void main(String[] args) {
		int arr[] = { 4, 3, 7, 8, 6, 2, 1 };

		for (int i : convertZigZag(arr, args.length)) {
			System.out.println(i);
		}
	}

	private static int[] convertZigZag(int[] arr, int length) {
		boolean flag = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (flag) {

				if (arr[i] > arr[i + 1]) {
					swap(arr, i);
				}
			} else {
				if (arr[i] < arr[i + 1]) {
					swap(arr, i);
				}
			}
			flag = !flag;
		}
		return arr;
	}

	private static void swap(int[] arr, int i) {
		int temp = arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;
	}

}
