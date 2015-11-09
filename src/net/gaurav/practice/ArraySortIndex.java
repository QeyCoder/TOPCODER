package net.gaurav.practice;

public class ArraySortIndex {

	public static void main(String[] args) {
		int arr[] = { 50, 40, 70, 60, 90 };
		int index[] = { 3, 0, 4, 1, 2 };

		makeSol(arr, index);
	}

	private static void makeSol(int[] arr, int[] index) {
		int temp[] = new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[index[i]] = arr[i];
		}
		int j = 0;
		for (int i : temp) {
			arr[j] = i;
			index[j] = j;
			j++;
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i] + "<-->" + index[i]);
		}
	}
}
