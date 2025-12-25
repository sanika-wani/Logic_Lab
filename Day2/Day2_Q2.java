package training1;
import java.util.Scanner;
public class Day2_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total= 0;
        System.out.println("Enter marks: ");
        for (int i = 0; i<5 ;i++){
        	marks[i]= sc.nextInt();
        	total +=marks[i];
        }
        double percentage = total/5.0;
        char grade;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 40)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
