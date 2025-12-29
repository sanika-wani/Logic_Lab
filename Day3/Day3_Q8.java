package training1;
import java.util.Scanner;

public class Day3_Q8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        String result = checkpass(username, password);

        if (result.equals("VALID")) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password.");
            System.out.println("Feedback:");
            System.out.println(result);
        }

        sc.close();
    }

    static String checkpass(String username, String password) {

        String result = "";

        boolean toggleDigit = false;
        boolean toggleUpper = false;
        boolean toggleLower = false;
        boolean toggleSpecial = false;

        if (password.length() < 8 || password.length() > 20) {
            result += "- Password length must be between 8 and 20 characters.\n";
        }

        if (password.contains(" ")) {
            result += "- Password must not contain spaces.\n";
        }

        String pwdLower = password.toLowerCase();
        String userLower = username.toLowerCase();

        for (int i = 0; i <= userLower.length() - 3; i++) {
            String part = userLower.substring(i, i + 3);
            if (pwdLower.contains(part)) {
                result += "- Avoid using parts of your name.\n";
                break;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                toggleDigit = true;
            }
            else if (Character.isUpperCase(ch)) {
                toggleUpper = true;
            }
            else if (Character.isLowerCase(ch)) {
                toggleLower = true;
            }
            else if ("!@#$%^&*".indexOf(ch) != -1) {
                toggleSpecial = true;
            }
            else {
                continue;
            }
        }

        if (!toggleUpper) result += "- Add at least one uppercase letter.\n";
        if (!toggleLower) result += "- Add at least one lowercase letter.\n";
        if (!toggleDigit) result += "- Add at least one digit.\n";
        if (!toggleSpecial) result += "- Add more special characters.\n";

        if (result.isEmpty()) {
            return "VALID";
        }

        return result;
    }
}
