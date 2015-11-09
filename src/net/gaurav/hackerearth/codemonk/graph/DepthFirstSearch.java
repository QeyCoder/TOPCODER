package net.gaurav.hackerearth.codemonk.graph;

import java.util.Scanner;
import java.util.Stack;

public class DepthFirstSearch {
	Stack<Integer> stack = new Stack<>();

	static boolean adjMatrix[][] = new boolean[10][10];
	static int edges;
	static int nodes;

	public static void main(String[] args) {

		initialize();

		int x = 0;
		int y = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No of NOdes");
		nodes = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter No of Edges");
		edges = Integer.parseInt(scanner.nextLine());
		System.out.println("enter node with space bw nodes");
		for (int i = 0; i < edges; i++) {
			String[] input = scanner.nextLine().split(" ");
			x = Integer.parseInt(input[0]);
			y = Integer.parseInt(input[1]);
			adjMatrix[x][y] = true;
		}
		scanner.close();

		dfs();
	}

	private static void dfs() {
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				
				
			}
		}

	}

	private static void initialize() {
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				adjMatrix[i][j] = false;
			}
		}
	}
}
