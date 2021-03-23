package baitap;

import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		int n;
		int i;
	Scanner k=new Scanner(System.in);
	System.out.println("nhap n");
	n=k.nextInt();
	for(i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0)break;
		if(i<=Math.sqrt(n))
			System.out.println("khong phai so nguyen to");
		else
			System.out.println("n la so nguyen to");
	}
	}

}
