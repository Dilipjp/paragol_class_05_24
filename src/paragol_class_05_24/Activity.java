package paragol_class_05_24;

public class Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int factorial = 1;
//		factorial = fact(6);
//		System.out.println(factorial);
		
		
//		reverseString("Paragol");
		
		printNum(15);

	}
	
	public static int fact(int n) {
		int val;
		if(n==0) {
			return 1;
		}else {
			val = n*fact(n-1);
			return (val);
		}
		
	}
	
	public static void reverseString(String str) {
		if(str.length() <= 1 || str == null) {
			System.out.println(str);
		}else {
			System.out.print(str.charAt(str.length()-1));
			reverseString(str.substring(0, str.length()-1));
		}
	}
	
	public static void printNum(int n) {
		if(n <= 0l) {
			System.out.print(0+ " ");
		}else {
			printNum(n-1);
			System.out.print(" " +n + " ");
			
		}
	}
	
	

}
