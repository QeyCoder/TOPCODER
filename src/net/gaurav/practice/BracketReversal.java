package net.gaurav.practice;

public class BracketReversal {

	public static void main(String[] args) {

		String inp = "}{{}}{{{";
		String l = "{";
		String r = "}";
		boolean prevL = false, prevR = false;
		String[] op = inp.split("");
		int ko = 0;
		String[] tempo = new String[op.length];
		for (String temp : op) {
			if (temp.equalsIgnoreCase(l)) {
				tempo[ko] = temp;
				prevL = true;
			} else {
				if (prevL) {
					tempo[ko - 1] = "";
				}
				prevR = true;
			}
			ko++;
		}
		System.out.println("");
	}
}
