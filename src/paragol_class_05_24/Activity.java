package paragol_class_05_24;

public class Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1;
		factorial = fact(6);
		System.out.println(factorial);

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
	
	

}
