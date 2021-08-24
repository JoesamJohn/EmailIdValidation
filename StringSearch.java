package com.simplilearn.assignment2;

import java.util.Scanner;

public class StringSearch {
	public static void main(String[] args) {
		//String Array to store Email Addresses
		int nMatchingOccured = 0;
		int nContinueOrNot = 0;
		String sArray[] = {"joesam5974@yahoo.co.in",
				"joesam.zachariah@gmail.com",
				"shomoljoesam@yahoo.co.in",
				"shomolsj@gmail.com",
				"mailjoesam@hotmail.com",
				"jeremy.joesam@gmail.com",
				"joanna.joesam@gmail.com",
				"jeremyrocks@gmail.com",
				"joannarocks@gmail.com",
				"joesamrocks@gmail.com"
		};
		
		for (String element: sArray) {
			System.out.println("Stored Email Id: "+element);
		}
		
		Scanner scanValue = new Scanner(System.in);
		String sInputAddress;
		do {
			System.out.println("Enter Your Email Address to Login: ");
			sInputAddress = scanValue.next();
			
			for(int i = 0; i < 10; i++) {
				if(sArray[i].equals(sInputAddress)) {
					System.out.println("Matching Successful: Valid Email Address...You are succesfully Logged In...");
					nMatchingOccured = 1;
					break;
				}
				else {
					nMatchingOccured = 0;
					continue;
				}
			}
			
			if(nMatchingOccured != 1) {
				System.out.println("Do you want to try again? (Yes-1/No-0): ");
				nContinueOrNot = scanValue.nextInt();
				if(nContinueOrNot == 1)
					continue;
				else
					break;
			}
		}while(nMatchingOccured == 0);
	}
}
