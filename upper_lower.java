package strings;
import java.util.Scanner;
public class upper_lower {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String a=sc.nextLine();
		System.out.println("uppercase:"+a.toUpperCase());
		System.out.println("lowerrcase:"+a.toLowerCase());
	}

}
