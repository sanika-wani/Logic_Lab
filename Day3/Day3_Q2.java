package training1;
import java.util.Scanner;

public class Day3_Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();  

        String[] names = new String[n];
        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();  
            grades[i] = sc.nextInt();  
            sc.nextLine();              
        }

        while (true) {
            int choice = sc.nextInt();
            sc.nextLine();   

            switch (choice) {
                case 1:
                    printAll(names, grades);
                    break;

                case 2:
                    printTopper(names, grades);
                    break;

                case 3:
                    printAverage(grades);
                    break;

                case 4:
                    searchByName(names, grades, sc);
                    break;

                case 5:
                    curveGrades(grades);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
                    continue;
            }
        }
    }
    static void printAll(String[] names, int[] grades) {
        System.out.print("All: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "(" + grades[i] + ")");
            if (i < names.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    static void printTopper(String[] names, int[] grades) {
        int idx = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > grades[idx]) idx = i;
        }
        System.out.println("Topper: " + names[idx] + "(" + grades[idx] + ")");
    }

    static void printAverage(int[] grades) {
        double sum = 0;
        for (int g : grades) sum += g;
        System.out.printf("Average: %.2f%n", sum / grades.length);
    }

    static void searchByName(String[] names, int[] grades, Scanner sc) {
        String key = sc.nextLine();

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(key)) {
                System.out.println("Found: " + names[i] + "(" + grades[i] + ")");
                return;
            }
        }
        System.out.println("Student not found");
    }

    static void curveGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = Math.min(grades[i] + 5, 100);
        }
        System.out.println("Grades curved");
    }
}

// in this program we make different functions for each operation. 
//and used switch case to select an operation to be done.
//in the last we take minimum between marks+5 and 100.