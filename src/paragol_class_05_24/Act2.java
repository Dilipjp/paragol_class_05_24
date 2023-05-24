package paragol_class_05_24;

import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter num for x");
		    int x = myObj.nextInt();  // Read user input
		    System.out.println("Enter num for n");
		    int n = myObj.nextInt();
		    System.out.println(power(x, n));;

	}
	
	
	
	
	public static int power(int x, int n) {
		if(n < 0) {
			System.out.println("Wrong input");
			return 0;
		}
		if(n == 0) {
			return 1;
		}else {
			return(x*power(x, n-1));
		}
		
		
	}

}
