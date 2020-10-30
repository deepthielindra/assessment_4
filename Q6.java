package com.lab_assignment_4;

import java.util.*;


public class Q6 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int num = sc.nextInt();
			try {
				if(num > 100) {
					throw new InputException("number can't be greater than 100");
				}
			} catch (InputException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

