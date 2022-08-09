package Com.org;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String a = "Nandhagopal";
		
		String temp = "";
		
		for (int i = a.length() -1; i >=0; i-- ) {
			
			char value = a.charAt(i);
			
			temp = temp + value;
			
		}
		System.out.println(temp);
	}
}
	


		  