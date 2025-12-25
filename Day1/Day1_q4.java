package training1;
import java.util.Scanner;

public class Day1_q4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        result(s);
        in.close();
    }
    static void result(String s) {
        int[] freq = new int[26];
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z' && freq[ch - 'a'] > 0) {
                System.out.println(ch + " : " + freq[ch - 'a']);
                freq[ch - 'a'] = 0;  
            }
        }
    }
}
