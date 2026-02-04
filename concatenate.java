package strings;
import java.util.Scanner;
public class concatenate {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String a=sc.nextLine();
		System.out.println("enter another string");
		String b=sc.nextLine();
		String result=a.concat(" "+b);
		System.out.println(result);
	}

}
