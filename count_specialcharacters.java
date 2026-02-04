package strings;
import java.util.Scanner;
public class count_specialcharacters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String a=sc.nextLine();
		int special=0;
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(!(ch>='A' && ch<='Z' ||
					ch>='a' && ch<='z' ||
					ch>='0' && ch<='9')) {
				special++;
				//System.out.println(special);
			}
				
		}
		System.out.println("special characters:"+special);
	}

}
