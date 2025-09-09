package packageName;
import java.io.*;

public class Fraction {
	private static int numerator;
	private static int denominator;
	
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	public Fraction(int n) {
		numerator = n;
		denominator = 1;
	}
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	public double toDecimal() {
		return (double)numerator/denominator;
	}
	public static Fraction simplify() {
		int great = gcd(numerator, denominator);
		Fraction f2 = new Fraction(numerator/great, denominator/great);
		return f2;
	}
	public String toString() {
		return numerator + "/" + denominator;
	}
	static int gcd(int a, int b)
    {
        int i;
        if (a < b)
            i = a;
        else
            i = b;
        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }
	public boolean equals(Fraction f2) {
		if (f2.toDecimal() == toDecimal()) {
			return true;
		}
		return false;
	}
}
