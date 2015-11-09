package net.gaurav.hackerearth;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Calendar;

/******************************************************************************
 * * Compilation: javac Permutations.java * Execution: java Permutations N * *
 * Enumerates all permutations on N elements. * Two different approaches are
 * included. * * % java Permutations 3 * abc * acb * bac * bca * cab * cba *
 ******************************************************************************/

public class Permutations {
	private static OutputStreamWriter outputStreamWriter;

	// print N! permutation of the characters of the
	// string s (in order)
	public static void perm1(String s) throws IOException {
		perm1("", s);
	}

	private static void perm1(String prefix, String s) throws IOException {
		int N = s.length();
		if (N == 0) {
			outputStreamWriter.write(prefix + "\n");
		} else {
			for (int i = 0; i < N; i++)
				perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, N));
		}
	} // print N! permutation of the elements of array a (not in order)
		//

	public static void perm2(String s) throws IOException {
		int N = s.length();
		char[] a = new char[N];
		for (int i = 0; i < N; i++)
			a[i] = s.charAt(i);
		perm2(a, N);
	}

	private static void perm2(char[] a, int n) throws IOException {
		if (n == 1) {
			outputStreamWriter.write(a);

			outputStreamWriter.write("\n");
			return;
		}
		for (int i = 0; i < n; i++) {
			swap(a, i, n - 1);
			perm2(a, n - 1);
			swap(a, i, n - 1);
		}
	} // swap
		// the
		// characters
		// at

	private static void swap(char[] a, int i, int j) {
		char c = a[i];
		a[i] = a[j];
		a[j] = c;
	}
	
	public static void main(String[] args) {

		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				try {
					mains(null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread thread = new Thread(r);
		thread.start();
	}

	public static void mains(String[] args) throws IOException {
		Calendar calendar = Calendar.getInstance();
		FileOutputStream fileOutputStream = new FileOutputStream(new File("ABC.LOG"));
		outputStreamWriter = new OutputStreamWriter(fileOutputStream, Charset.defaultCharset().name());
		outputStreamWriter.write("startName" + calendar.getTime() + "\n");
		String alphabet = "GAURAVDUDEJA";
		int N = alphabet.length();
		String elements = alphabet.substring(0, N);
		
		try {
			perm1(elements);
			outputStreamWriter.write("\n " + calendar.getTime());
			perm2(elements);
			outputStreamWriter.write("\n " + calendar.getTime());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			outputStreamWriter.close();
		}
	}
}
