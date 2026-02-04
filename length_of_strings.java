package strings;
import java.util.Scanner;
public class length_of_strings {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String a=sc.nextLine();
		int length=a.length();
		System.out.println("length of string:"+length);
	}

}
