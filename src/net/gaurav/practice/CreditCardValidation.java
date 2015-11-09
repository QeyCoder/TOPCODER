package net.gaurav.practice;

//Luhn Algorithm
public class CreditCardValidation {

	public static void main(String[] args) {
		String sampleCard = "5123456789012346";

		isValidCard(sampleCard);
	}

	private static void isValidCard(String sampleCard) {
		int temp[] = new int[sampleCard.length()];

		for (int i = 0; i < sampleCard.length(); i++) {
			temp[i] = Integer.parseInt(sampleCard.substring(i, i + 1));
		}
		for (int i = temp.length - 1; i >= 0; i = i - 1) {
			if (i % 2 == 0) {
				temp[i] = temp[i] * 2;
				if (temp[i] > 9) {
					temp[i] = temp[i] % 10 + 1;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		if (sum % 10 == 0) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
