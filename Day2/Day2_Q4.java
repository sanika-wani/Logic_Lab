public class ReverseWords {
    public static void main(String[] args) {
        String s = "Java is fun";
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String w : words) {
            result.append(new StringBuilder(w).reverse()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}