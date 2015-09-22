package net.gaurav.hackerearth;

import java.io.IOException;
import java.util.Scanner;

public class IshuAndItsMachine {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());
		int[] toBeRemoved = new int[input];
		for (int i = 0; i < toBeRemoved.length; i++) {
			toBeRemoved[i] = scanner.nextInt();
		}
		process(toBeRemoved);
		scanner.close();
	}

	private static void process(int[] toBeRemoved) {
		StringBuilder op = new StringBuilder();
		for (int i = 0; i < toBeRemoved.length; i++) {
			if (i == 0) {
				op = op.append(toBeRemoved[i] + " ");
			} else {
				op = op.append(toBeRemoved[i] - i + " ");
			}
		}
		System.out.println(op);
	}

}
