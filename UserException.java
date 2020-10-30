package com.lab_assignment_4;

import java.util.Scanner;

public class UserException {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter a  number");

			int num = sc.nextInt();
			try {
				if (num > 100) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Number can't be greater than 100");
			}
		}
	}
}