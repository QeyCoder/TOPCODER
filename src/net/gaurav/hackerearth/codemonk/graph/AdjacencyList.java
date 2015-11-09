package net.gaurav.hackerearth.codemonk.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class AdjacencyList {
	static Map<Integer, List<Integer>> adjList = new HashMap<>();
	static int nodes;
	static int edges;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No of nodes");
		nodes = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter No of edges");
		edges = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < edges; i++) {
			String[] split = scanner.nextLine().split(" ");
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);

			List<Integer> list = adjList.get(x);
			if (list == null) {
				list = new ArrayList<>();
				list.add(y);
				adjList.put(x, list);
			} else {
				list.add(y);
			}

		}
		printOutput();
	}

	private static void printOutput() {
		for (Entry<Integer, List<Integer>> entrySet : adjList.entrySet()) {
			System.out.print(entrySet.getKey() + "--->");
			for (Integer val : entrySet.getValue()) {
				System.out.print(val + ",");
			}
			System.out.print("\n");
		}

	}
}
