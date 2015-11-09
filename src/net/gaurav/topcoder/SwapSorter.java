package net.gaurav.topcoder;

public class SwapSorter {

	/*
	 * @Link
	 * http://community.topcoder.com/stat?c=problem_statement&pm=5874&rd=8076
	 * 
	 * 
	 * Problem Statement for SwapSorter
	 * 
	 * 
	 * Problem Statement
	 * 
	 * The organization of an array A is computed as follows: Create an array B
	 * containing the exact same elements as A, but sorted in non-descending
	 * order. Count the number of distinct values for i such that A[i] is equal
	 * to B[i]. This value is the organization of the array A. For example, the
	 * organization of { 2, 1, 1, 3 } is 2 because the second and fourth
	 * elements are not changed after sorting.
	 * 
	 * Two elements may be swapped only if the organization of the array would
	 * increase as a result of the swap.
	 * 
	 * You will be given a int[] arrayData. Return the maximal number of the
	 * swap operations that can be performed.
	 * 
	 * 
	 * Definition
	 * 
	 * Class: SwapSorter Method: maximizeSwaps Parameters: int[] Returns: int
	 * Method signature: int maximizeSwaps(int[] arrayData) (be sure your method
	 * is public)
	 * 
	 * 
	 * Constraints - arrayData will have between 1 and 50 elements, inclusive. -
	 * Each element of arrayData will be between 1 and 1000, inclusive.
	 * 
	 * Examples 0)
	 * 
	 * {2, 1, 1, 3} Returns: 1 The only possible swap is {2, 1, 1, 3} -> {1, 1,
	 * 2, 3} 1)

	 * {7, 5, 3, 4} Returns: 3 {7, 5, 3, 4} -> {3, 5, 7, 4} -> {3, 4, 7, 5} ->
	 * {3, 4, 5, 7} 2)
	 * 
	 * {2, 1, 4, 3} Returns: 2 {2, 1, 4, 3} -> {1, 2, 4, 3} -> {1, 2, 3, 4} 3)
	 * 
	 * {1, 7, 8, 12, 17, 19, 21, 23, 24, 25, 26, 27, 35} Returns: 0 The array is
	 * already sorted. 4)
	 * 
	 * {2, 3, 3, 1, 1, 2} Returns: 5 5)
	 * 
	 * {2, 3, 4, 1, 7, 7, 5, 5, 8, 7, 10, 10, 10, 9, 9, 9} Returns: 11
	 */}
