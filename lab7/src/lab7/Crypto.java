package lab7;

import java.util.ArrayList;

public class Crypto {
	public static String encrypt(String mes, int rnum) {
		int letterlocation = -1;
		String newstring = "";
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String letters_upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < mes.length(); i++) {
			if (letters_upper.indexOf(mes.substring(i, i+1)) >= 0){
				letterlocation = letters_upper.indexOf(mes.substring(i, i+1));
				newstring += letters_upper.substring((letterlocation + rnum)%26, ((letterlocation + rnum)%26)+1);
			}
			else if (letters.indexOf(mes.substring(i, i+1)) >= 0) {
				letterlocation = letters.indexOf(mes.substring(i, i+1));
				newstring += letters.substring((letterlocation + rnum)%26, ((letterlocation + rnum)%26)+1);
			}
			else {
				newstring += mes.substring(i, i+1);
			}
		}
		return newstring;
	}
	
	
	public static String decrypt(String mes, int lnum) {
		int letterlocation = -1;
		String newstring = "";
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String letters_upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < mes.length(); i++) {
			if (letters_upper.indexOf(mes.substring(i, i+1)) >= 0){
				letterlocation = letters_upper.indexOf(mes.substring(i, i+1));
				if ((letterlocation - lnum)< 0) {
					newstring += letters_upper.substring(26+(letterlocation - lnum), (26+(letterlocation - lnum))+1);
				}
				else{
					newstring += letters_upper.substring((letterlocation - lnum), ((letterlocation - lnum))+1);
				}
			}
			else if (letters.indexOf(mes.substring(i, i+1)) >= 0) {
				letterlocation = letters.indexOf(mes.substring(i, i+1));
				if ((letterlocation - lnum)< 0) {
					newstring += letters.substring(26+(letterlocation - lnum), (26+(letterlocation - lnum))+1);
				}
				else{
					newstring += letters.substring((letterlocation - lnum), ((letterlocation - lnum))+1);
				}
			}
			else {
				newstring += mes.substring(i, i+1);
			}
		}
		return newstring;
	}
}