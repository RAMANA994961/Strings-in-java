package strings;
import java.util.Scanner;
public class countupperlower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String a=sc.nextLine();
		int upper=0;
		int lower=0;
		for(int i=0;i<a.length();i++) {
			char b=a.charAt(i);
			if(b>='A' && b<='Z') {
				upper++;
			}else if(b>='a' && b<='z') {
				lower++;
			}
		}
		System.out.println("upper case:" +upper);
		System.out.println("lower cases:" +lower);
	}

}
