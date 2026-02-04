package strings;
import java.util.Scanner;
public class count_words {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String a=sc.nextLine();
		String[] words=a.trim().split(" ");
		System.out.println("number of words:"+words.length);
	}

}
