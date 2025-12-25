//Smallest element in an array
package training1;
import java.util.Scanner;
public class Day1_q2 {

	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter elements: ");
		for(int i = 0; i<arr.length; i++) {
			arr[i]= in.nextInt();
			min = Math.min(min, arr[i]);
		}
		System.out.println(min);
		in.close();
		

	}

}
