package training1;
import java.util.Scanner;

public class Day1_q3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = in.nextInt();
        boolean result = isPrime(num);

        System.out.println(result);
        in.close();
    }

    static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
