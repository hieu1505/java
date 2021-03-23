package baitap;

import java.util.Scanner;

public class a4 {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner k=new Scanner(System.in);
		System.out.println("a=");
		a=k.nextInt();
		System.out.println("b=");
		b=k.nextInt();
		System.out.println("UCLN ciua"+a+"va"+b+"la"+condi(a,b));
}
	public static int condi(int a,int b) {
		return (b==0)?a:condi(b,a%b);
		
	}
	}
