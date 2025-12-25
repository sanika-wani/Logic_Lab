package training1;
import java.util.Scanner;

public class Day2_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose:(a) f-> c    b)c-f");
		char choice = sc.next().charAt(0);
		double val = sc.nextDouble();
		if(choice == 'a') {
			val =  (val-32)*5.0/9;
		}
		else if(choice == 'b') {
			val = (val * 9/5)+32;
		}
		else {
            System.out.println("Invalid choice");
            
        }	
		System.out.println(val);
		sc.close();

	}

}
