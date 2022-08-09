package Com.org;

import java.util.Scanner;

public class Reverse_pract1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		
		String name = s.nextLine();
		String temp ="";
		
		for (int i =name.length() -1; i>=0; i--) {
			
			char a = name.charAt(i);
			temp = temp + a;
		}
		System.out.println(temp);
		
		
		System.out.println("Nandhagopal");
		String name1 = s.nextLine();
		StringBuffer ref = new StringBuffer(name1);
		StringBuffer rev = new StringBuffer(ref.reverse());
		System.out.println("BY String Buffer :" + ref);
		
		StringBuilder ref1 =new StringBuilder(name1);
		System.out.println("by string builder :" + ref1.reverse());
		
		
	}

}
