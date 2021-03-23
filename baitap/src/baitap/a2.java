package baitap;

import java.util.Scanner;
//sx tang dan
public class a2 {

	public static void main(String[] args) {
	int [] a= {5,7,2,4,8};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++ ) {
			if(a[i]>a[j]) {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}
	
	}

}
