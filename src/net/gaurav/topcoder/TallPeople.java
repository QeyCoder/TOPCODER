package net.gaurav.topcoder;

public class TallPeople {

	private static int colS;

	/*
	 * Problem Link
	 * 
	 * @Link
	 * http://community.topcoder.com/stat?c=problem_statement&pm=2923&rd=5854
	 * 
	 * 
	 * 
	 * 
	 * Problem Statement
	 * 
	 * A group of people stand before you arranged in rows and columns. Looking
	 * from above, they form an R by C rectangle of people. You will be given a
	 * String[] people containing the height of each person. Elements of people
	 * correspond to rows in the rectangle. Each element contains a
	 * space-delimited list of integers representing the heights of the people
	 * in that row. Your job is to return 2 specific heights in a int[]. The
	 * first is computed by finding the shortest person in each row, and then
	 * finding the tallest person among them (the "tallest-of-the-shortest").
	 * The second is computed by finding the tallest person in each column, and
	 * then finding the shortest person among them (the
	 * "shortest-of-the-tallest").
	 * 
	 * 
	 * 
	 * 
	 * Constraints
	 * 
	 * 
	 * - people will contain between 2 and 50 elements inclusive. - Each element
	 * of people will contain between 3 and 50 characters inclusive. - Each
	 * element of people will be a single space-delimited list of positive
	 * integers such that:
	 * 
	 * 1) Each positive integer is between 1 and 1000 inclusive with no extra
	 * leading zeros.
	 * 
	 * 2) Each element contains the same number of integers.
	 * 
	 * 3) Each element contains at least 2 positive integers.
	 * 
	 * 4) Each element does not contain leading or trailing whitespace.
	 */
	static int max = 50;
	static int min = 2;

	public static void main(String[] args) {

		String[] inp = { "4,54,32,4,23,3", "12,32,4,1,4,5", "12,43,5,1,3,5" };
		int row = inp.length;
		int col = inp[0].split(",").length;
		int[][] inp1 = new int[row][col];
		for (int i = 0; i < inp1.length; i++) {
			String[] temp = inp[i].split(",");
			for (int j = 0; j < temp.length; j++) {
				inp1[i][j] = Integer.parseInt(temp[j]);
			}
		}
		solution(inp1);

	}

	private static void solution(int[][] inp1) {
		System.out.println(shortestRowWise(inp1) + " " + tallestColumnWise(inp1));

	}

	private static int shortestRowWise(int[][] inp) {
		int shortestest = max;
		int[] shortestPeople = new int[inp.length];
		for (int i = 0; i < inp.length; i++) {
			for (int j = 0; j < inp[i].length; j++) {
				if (inp[i][j] < shortestest) {
					shortestest = inp[i][j];
				}
			}
			shortestPeople[i] = shortestest;
		}

		int longest = min;

		for (int i = 0; i < shortestPeople.length; i++) {
			if (shortestPeople[i] < longest) {
				longest = shortestPeople[i];
			}
		}
		return longest;
	}

	private static int tallestColumnWise(int[][] inp) {
		int longest = min;
		int[] longetstPeoples = new int[inp[0].length];
		for (int i = 0; i < inp[0].length; i++) {
			for (int j = 0; j < inp.length; j++) {
				if (inp[j][i] > longest) {
					longest = inp[j][i];
				}
			}
			longetstPeoples[i] = longest;
		}
		int shortest = max;

		for (int i = 0; i < longetstPeoples.length; i++) {
			if (longetstPeoples[i] < shortest) {
				shortest = longetstPeoples[i];
			}
		}
		return shortest;
	}

}
