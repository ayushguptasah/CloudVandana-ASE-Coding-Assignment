package com.pangramornot.java;

import java.util.Scanner;

public class PangramOrNotApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = scan.nextLine();
		PangramOrNot.Pangram(str);
	}

}
