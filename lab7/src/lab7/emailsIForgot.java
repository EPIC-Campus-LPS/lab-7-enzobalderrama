package lab7;

import java.util.Scanner;

public class emailsIForgot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Email: ");
		String email = scan.nextLine();
		scan.close();
		int bad = email.indexOf("@");
		System.out.print(email.substring(0, bad) + ", ");
		int length = (int) (Math.random()*3 + 10);
		int tempvar = -1;
		String letters = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < length; i++) {
			if (Math.random() <= 0.7) {
				tempvar = (int)(Math.random()*26);
				System.out.print(letters.substring(tempvar, tempvar+1));
			}
			else {
				System.out.print((int)(Math.random()*10));
			}
		}
	}

}
