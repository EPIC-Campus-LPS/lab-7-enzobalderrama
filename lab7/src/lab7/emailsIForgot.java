package lab7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class emailsIForgot {

	public static void main(String[] args) throws IOException{
		File file = new File("file.txt");
        Scanner sc = new Scanner(file);
        String email = "";
        while(sc.hasNextLine()){
            email = sc.nextLine();
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
    		System.out.println();
        }
		
		sc.close();
	}

}
