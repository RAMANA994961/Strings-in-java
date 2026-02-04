package strings;
import java.util.Scanner;
public class add_two_strings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String a=sc.nextLine();
		System.out.println("enter another string");
		String b=sc.nextLine();
		String result=a+b;
		System.out.println("result:"+ result);
	}

}
