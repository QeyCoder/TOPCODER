package net.gaurav.practice;

public class PairElement {
//http://www.geeksforgeeks.org/check-if-an-array-can-be-divided-into-pairs-whose-sum-is-divisible-by-k/
	public static void main(String[] args) {

		int[] ip = { 9, 7, 5, 3};
		int k = 6;
		System.out.println(calc(ip, k));
	}

	private static boolean calc(int[] ip, int k) {
		int s = ip.length & 1;
		if (s != 0) {
			return false;
		}
		int op = 0;
		int freq[] = new int[ip.length];

		int j = 0;
		for (int i : ip) {
			freq[j] = i % k;
			op += freq[j++];
		}
		if (op % k == 0) {
			return true;
		}
		return false;

	}
}
