package baitap;

import java.util.Scanner;

public class a8 {
	

private static 	Scanner t=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("nhap n=");
		int n=t.nextInt();
		System.out.println("tat ca so nguyen to nho hon%d la:,n");
		if(n>=2) {
			System.out.println(2);
		}
		for(int i=3;i<n;i+=2) {
			if(is(i)) {
				System.out.println(""+i);
			}
		}
	}
	public static Boolean is(int s) {
		if(s<2) {return false;}
		int st=(int )Math.sqrt(s);
		for(int i=2;i<st;i++) {
			if(s%i==0) {
				return false;
			}
			
		}
		
		return true;
	}

}
