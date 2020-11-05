package lab;

import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String sobj=sc.next();
		System.out.println("Enter user's choice:");
		int choice=sc.nextInt();
		method(sobj,choice);
	}
	public static void method(String str,int ch) {
		String s=new String();
	
		switch(ch) {
		case 1: System.out.println("Result of adding string to itself: ");
				str=str.concat(str);
				System.out.println(str);
				break;
		case 2:System.out.println("Replace odd position with # ");
				for (int x=0; x < str.length(); x++){
	        			if (x % 2 != 0){
	        				str = str.substring(0,x-1) + "#" + str.substring(x, str.length());
	        			}
	        	}
				System.out.println(str);
				break;
		case 3:System.out.println("Remove duplicate characters in the String:");
				for(int i=0;i<str.length();i++) {
					for(int j=0;j<s.length();j++) {
						if(str.charAt(i)!=s.charAt(j)) {
							s=s+str.charAt(i);	
						}
					}
				}
				System.out.println(s);
				break;
		case 4:System.out.println("Change odd characters to upper case");
				
					char[] s1 = new char[str.length()];
					for (int i = 0; i < str.length(); i++) {
						s1[i] = str.charAt(i); 
				    } 
					for (int i = 0; i < str.length(); i++) { 
				            if(i%2==0) {
				            	s1[i]=Character.toUpperCase(s1[i]);
				            }
				    }
					String s2=new String(s1);
					System.out.println(s2);
					break;
			
		default: System.out.println("Not a valid option!");
	}

}
}

