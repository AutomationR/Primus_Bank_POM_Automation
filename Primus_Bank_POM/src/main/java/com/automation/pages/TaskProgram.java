package com.automation.pages;

import java.util.ArrayList;
import java.util.Collections;

public class TaskProgram {
	public static void main(String[] args) {

		int a = 459;
		int b = 879;

		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();

		int loop = 0;
		int loop2 = 0;

		while (loop < 3) {
			int element = a % 10; 
			a = a / 10;
			arr.add(element);
			loop++;
		}
		

		Collections.reverse(arr);

		// System.out.println(arr);

		while (loop2 < 3) {
			int element = b % 10;
			b = b / 10;
			arr2.add(element);
			loop2++;
		}

		Collections.reverse(arr2);

		// System.out.println(arr2);

	/*	for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr2.size(); j++) {
				if (arr.get(i) < arr2.get(j)) {
					int output = arr2.get(j) - arr.get(i);
					System.out.println(output);
					break;
				}*/

			

		

	}

}
