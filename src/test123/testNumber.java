package test123;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class testNumber {

		public static void main(String args[]){
	
			int i;
			
			Scanner in = new Scanner(System.in);
					
			System.out.println("Please enter a number  (for exit enter '0') : ");	
			
			//i = in.nextInt();
			while ((i = in.nextInt()) != 0) {
		    System.out.println("You entered the number "+NumberFormat.getNumberInstance(Locale.US).format(i));
		    System.out.println("Please enter a number  (for exit enter zero) : ");
			
			}
			 System.out.println("Out of program");
	}
			
		
}
