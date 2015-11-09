package net.gaurav.hackerearth;

import java.math.BigInteger;
import java.nio.file.attribute.AclEntry.Builder;
import java.util.Scanner;

import javax.jws.Oneway;

public class CrazyNumbers {

	/*
	 * @LINK https://www.hackerearth.com/national-instruments-hiring-challenge/
	 * problems/57b97e3a12a942ffb09a101216736703/
	 * 
	 * 
	 * Golu is crazy about numbers. He loves those numbers such that the
	 * difference between the adjacent digits of that number is exactly one. He
	 * calls these numbers crazy numbers and wants to find out how many such
	 * numbers exist for N number of digits. This task is very difficult for him
	 * so he wants your help.
	 * 
	 * Now your task is to find how many N digit crazy numbers exist such that
	 * the difference between the adjacent digits of the number is exactly one.
	 * For eg: For N = 3, crazy numbers are 123 , 434 , 567 etc. Numbers like
	 * 576, 453 etc. are not considered crazy numbers.
	 * 
	 * Note: Number must not contain any leading zeroes.
	 * 
	 * Input: The first line contains the number of test cases T. Next T lines
	 * contains number of digits i.e. N.
	 * 
	 * Output: Find out how many crazy numbers exist containing exactly N
	 * digits. Output can become large, so take modulo with 10^9+7 i.e.
	 * 1000000007.
	 * 
	 * Constraints: 1 <= T <=100 1 <= N <=10^6
	 * 
	 * Sample Input(Plaintext Link) 2 1 2 Sample Output(Plaintext Link) 10 17
	 * Explanation For N=1, crazy numbers are 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8
	 * , 9 .
	 * 
	 * For N=2, crazy numbers are 10 , 12 , 21 , 23 , 32 , 34 , 43 , 45 , 54 ,
	 * 56 , 65 , 67 , 76 , 78 , 87 , 89 , 98.
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfIp = Integer.parseInt(scanner.nextLine());
		while (noOfIp-- > 0) {
			giveMeOutput(BigInteger.valueOf(Long.valueOf(scanner.nextLine())));
		}

	}

	private static void giveMeOutput(BigInteger bigInteger) {

		BigInteger min;
		BigInteger ten = BigInteger.valueOf(10);
		if (bigInteger == BigInteger.ONE) {
			min = BigInteger.ZERO;
		} else {
			min = ten.pow(bigInteger.intValue() - 1);
		}
		BigInteger max = ten.pow(bigInteger.intValue()).subtract(BigInteger.ONE);

		StringBuilder builder = new StringBuilder();
		while (min.compareTo(max) < 0) {
			boolean isCrazy = true;
			char[] temp = min.toString().toCharArray();
			for (int i = 0; i < temp.length - 1; i++) {
				int temp2 = temp[i] - temp[i + 1];
				if (Math.abs(temp2) != 1)
					isCrazy = false;
			}
			if (isCrazy) {
				builder.append(min + ",");
			}
			min = min.add(BigInteger.ONE);
		}
		System.out.println(builder);
	}
}
