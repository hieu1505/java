package baitap;
//xulikitu
public class a5 {

	public static void main(String[] args) {

String s="Write a Java program very easilly";
int cout =0;
for(int i=0;i<=s.length();i++) {
	if(s.charAt(i)=='a') {
		cout++;
		;
	}System.out.println(cout);
	int index =s.indexOf("Java");
	if(index>0)System.out.println("tu java dau tien cua chuoi la "+index);
	else System.out.println("chuoi ko chua tu java");
	if(s.startsWith("Write")==true)System.out.println("tu Write bat dau chuoi");
	else System.out.println("tu write ko bat dau chuoi");
	if(s.endsWith("easilly")==true)System.out.println("t cuoi chuoiu");
	else System.out.println("ko phai cuoi chuoi");
}

	}

}
