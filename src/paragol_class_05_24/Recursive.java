package paragol_class_05_24;

import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[15];
		myArray[0] = 12;
		myArray[1] = 13;
		myArray[2] = 14;
		myArray[3] = 15;
		myArray[4] = 16;
		myArray[5] = 17;
		myArray[6] = 18;
		myArray[7] = 19;
		myArray[8] = 20;
		myArray[9] = 21;
		myArray[10] = 22;
		myArray[11] = 23;
		myArray[12] = 24;
		myArray[13] = 25;
		myArray[14] = 12;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Which num are u looking?");
		int val = kb.nextInt();
		System.out.println(serch(myArray, 0, 14, val));

	}
	
	public static int serch(int[] myarray, int startIndex, int endIndex, int v) {
		if(startIndex > endIndex) {
			return -1;
		}
		if(myarray[startIndex] == v) {
			return startIndex;
		}
		if(myarray[endIndex] == v) {
			return endIndex;
		}
		return serch(myarray, startIndex + 1, endIndex - 1, v);
		
	}

}
