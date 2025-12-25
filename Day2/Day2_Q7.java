public class EvenOddSum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6};
        int evenSum = 0, oddSum = 0;

        for (int n : nums) {
            if (n % 2 == 0) evenSum += n;
            else oddSum += n;
        }

        System.out.println("Sum of Even = " + evenSum);
        System.out.println("Sum of Odd = " + oddSum);
    }
}