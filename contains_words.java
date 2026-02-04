package strings;
import java.util.Scanner;
public class contains_words {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String a=sc.nextLine();
		System.out.println("enter word");
		String word=sc.nextLine();
		if(a.contains(word)) {
			System.out.println("word contains:"+word);
		}else {
			System.out.println("word not contains:"+word);
		}
	}

}
