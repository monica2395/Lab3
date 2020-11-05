package lab;
import java.util.*;
public class PositiveString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.next();
		checks(s);
	}
	public static void checks(String str) {
		char[] ch=new char[str.length()];
		int t=0,f=0;
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
		}
		Arrays.sort(ch);
		
		for(int k=0;k<str.length();k++) {
			if(ch[k]!=str.charAt(k)) {
				f=f+1;
			}
			else {
				t=t+1;
			}
		}
		if(t!=str.length()) {
			System.out.println("False");
		}
		else {
			System.out.println("True");
		}	
	}

}
