package net.gaurav.topcoder;

public class DancingSentence {

	static int caps[] = { 65, 90 };
	static int small[] = { 97, 122 };
	static int space = 32;
	private static boolean isStart = true;

	/*
	 * Problem Link
	 * 
	 * @Link http://community.topcoder.com/stat?c=problem_statement&pm=5950
	 * Problem Statement
	 * 
	 * A sentence is called dancing if its first letter is uppercase and the
	 * case of each subsequent letter is the opposite of the previous letter.
	 * Spaces should be ignored when determining the case of a letter. For
	 * example, "A b Cd" is a dancing sentence because the first letter ('A') is
	 * uppercase, the next letter ('b') is lowercase, the next letter ('C') is
	 * uppercase, and the next letter ('d') is lowercase.
	 * 
	 * You will be given a String sentence. Turn the sentence into a dancing
	 * sentence by changing the cases of the letters where necessary. All spaces
	 * in the original sentence must be preserved.
	 * 
	 * 
	 * Definition
	 * 
	 * Class: DancingSentence Method: makeDancing Parameters: String Returns:
	 * String Method signature: String makeDancing(String sentence) (be sure
	 * your method is public)
	 * 
	 * 
	 * Constraints - sentence will contain between 1 and 50 characters,
	 * inclusive. - Each character in sentence will be a letter
	 * ('A'-'Z','a'-'z') or a space (' '). - sentence will contain at least one
	 * letter ('A'-'Z','a'-'z').
	 * 
	 * Examples 0)
	 * 
	 * "This is a dancing sentence" Returns: "ThIs Is A dAnCiNg SeNtEnCe" 1)
	 * 
	 * " This   is         a  dancing   sentence  " Returns:
	 * " ThIs   Is         A  dAnCiNg   SeNtEnCe  " Spaces should be ignored
	 * when determining the cases of the letters, but they should be preserved
	 * in the return value. 2)
	 * 
	 * "aaaaaaaaaaa" Returns: "AaAaAaAaAaA" 3)
	 * 
	 * "z" Returns: "Z"
	 */
	public static void main(String[] args) {
		System.out.println(makeDancing("This is a dancing sentence"));
	}

	private static char[] makeDancing(String string) {
		boolean isCaps = true;
		char[] inpArray = string.toCharArray();

		char[] oppArray = new char[inpArray.length];
		for (int i = 0; i < inpArray.length; i++) {
			int temp = (int) inpArray[i];
			if (temp == space) {
				oppArray[i] = inpArray[i];
			} else if (isStart) {
				isStart = false;
				isCaps = !isCaps;
				if (temp >= caps[0] && temp <= caps[1]) {
					oppArray[i] = (char) (temp);
				}
				if (temp >= small[0] && temp <= small[1]) {
					oppArray[i] = (char) (temp-32);
				}

			} else if (isCaps) {
				isCaps = !isCaps;
				if (temp >= caps[0] || temp <= caps[1]) {
					oppArray[i] = (char) (temp - 32);
				} else {
					oppArray[i] = inpArray[i];
				}
			} else if (!isCaps) {
				isCaps = !isCaps;
				if (temp >= small[0] || temp <= small[1]) {
					oppArray[i] = inpArray[i];
				} else {
					oppArray[i] = (char) (temp + 32);
				}
			}

		}
		return oppArray;

	}

}
