package strings;
import java.util.Scanner;
public class both_strings_equal {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String a=sc.nextLine();
	System.out.println("enter another string");
	String b=sc.nextLine();
	if(a.equals(b)) {
		System.out.println("both are equal");
	}else {
		System.out.println("not equal");
	}
}
}
