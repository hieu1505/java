package baitap;

import java.util.Scanner;

public class a9 {

	public static void main(String[] args) {
		int [] mang=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("vui long nhap");
		for(int i=0;i<mang.length;i++) {
			mang[i]=s.nextInt();
		}
		System.out.println("mang duoc nhap la");
		for(int x:mang) {
			System.out.println(x);
		}
		System.out.println("vui long nhap pt tim  kiem");
		int k=s.nextInt();
		for(int i=0;i<mang.length;i++) {
			if(k==mang[i]) {
				System.out.println("ptu tim thay o vi tri thu"+i+1);
			}
		}
		//tang dan
		for(int i=0;i<mang.length-1;i++) {
			for(int j=i+1;j<mang.length;j++) {
				if(mang[i]>mang[j]) {
					int temp=mang[i];
					mang[i]=mang[j];
					mang[j]=temp;
				}
			}
		}
		System.out.println("sx");
		for(int x:mang) {
			System.out.println(x);
		}
	}

}
