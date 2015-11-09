package net.gaurav.practice;

public class ReverseStringWithoutSpecialChar {

	public static void main(String[] args) {

		String ip = "a,s,dss,we,w#";
		System.out.println(ip);
		System.out.println(solve(ip));
	}

	private static char[] solve(String ip) {

		char[] temp = ip.toCharArray();

		int l = 0;
		int r = temp.length - 1;
		while (l < r) {
			if (!isAlphabet(temp[l])) {
				l++;

			} else if (!isAlphabet(temp[r])) {
				r--;
			} else {
				char tempo = temp[l];
				temp[l] = temp[r];
				temp[r] = tempo;
				l++;
				r--;
			}
		}
		return temp;
	}

	static boolean isAlphabet(char x) {
		return ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z'));
	}
}
