package baitap;

public class a3 {
public static long f(int n) {
	int kq=1;
	for(int i=2;i<n;i++) {
		kq*=i;
	}
	return kq;
}
	public static void main(String[] args) {
		long s=f(2)+f(7)+f(10);
		System.out.println(s);

	}

}
