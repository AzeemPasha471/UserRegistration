package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	// Scanner class for user input
	Scanner sc = new Scanner(System.in);

	// method to check firstname Valid or Invalid
	public void validateUsername() {
		System.out.println("Enter UserName");
		String userName = sc.next();
		// regex pattern for firstname
		String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(userName);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Valid username");
		} else {
			System.out.println("Invalid username");
		}
	}

	// method to check LastName Valid or Invalid
	public void validateLastname() {
		System.out.println("Enter LastName");
		String lastName = sc.next();
		// regex pattern for Lastname
		String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(lastName);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Valid username");
		} else {
			System.out.println("Invalid username");
		}
	}

	public static void main(String[] args) {
		UserRegistration registration = new UserRegistration();
		registration.validateUsername();
		registration.validateLastname();
	}
}
