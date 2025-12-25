package training1;
import java.util.Scanner;
public class Day1_q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = input.nextLine();
        char[] sArr = s.toCharArray();

        int j = sArr.length - 1; 

        for (int i = 0; i < sArr.length; i++) {
            while (j >= 0 && !isLetter(sArr[j])) {
                j--;
            }
            if (isLetter(sArr[i]) && i < j) {
                char temp = sArr[i];
                sArr[i] = sArr[j];
                sArr[j] = temp;
                j--;
            }
        }
        System.out.println(new String(sArr));
        input.close();
    }
    static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
