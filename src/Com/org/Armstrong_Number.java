package Com.org;

import java.util.Scanner;

public class Armstrong_Number {
	
	public static void main(String[] args) {
		int number=0;
		int temp,ord=0;
		int original=0;
		System.out.println("enter the value");
		Scanner sc=new Scanner(System.in);
		temp = sc.nextInt();
		while (number>0) {
			temp=number%10;
			original=original+(temp*temp*temp);
			number=number/10;
		}
		if (number==temp) {
			System.out.println("armstrong");
			
		} else {
System.out.println("not a armstrong");
		}
	}
	
	
	
	
}
	 
	
	   





