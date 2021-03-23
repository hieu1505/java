package baitap;

import java.util.Scanner;

public class a7 {
private static Scanner n=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("nhap so nguyen duong");
		int s=n.nextInt();
		System.out.println(s+"la so thuan nghich"+thuanngich(s));
	}
	public static boolean thuanngich(int s) {
		String num=String.valueOf(s);
		int size=num.length();
		for(int i=0;i<(size/2);i++) {
			if(num.charAt(i)!=num.charAt(size-i-1))
				return false;
		}
		return true;
	}

}
