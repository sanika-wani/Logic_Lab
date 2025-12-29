package training1;

public class Day3_Q1_SubproblemA {

    public static void main(String[] args) {
        String expr = "12+13-15";
        expr = expr.trim();

        StringBuilder number = new StringBuilder();
        char lastOperator = '+';
        int result = 0;

        for (int i = 0; i < expr.length(); i++) {

            // take number
            while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                number.append(expr.charAt(i));
                i++;
            }

            //take left operator
            int value = Integer.parseInt(number.toString());
            if (lastOperator == '-') {
                result -= value;
            } else {
                result += value;
            }

            // Store the next operator
            if (i < expr.length()) {
                lastOperator = expr.charAt(i); // '+' or '-'
            }

            // Reset number builder for next number
            number.setLength(0);
        }

        System.out.println(result);
    }
}
