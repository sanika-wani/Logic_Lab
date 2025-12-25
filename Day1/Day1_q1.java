package training1;
import java.util.Scanner;

public class Day1_q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = input.nextLine();
		StringBuilder sb= new StringBuilder(s);
		sb = sb.reverse();
		System.out.println(sb.toString());
		
		input.close();
		

	}

}
