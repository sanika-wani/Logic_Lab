import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int choice;

        do {
            System.out.println("1.Check Balance 2.Deposit 3.Withdraw 4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    balance += sc.nextInt();
                    System.out.println("New Balance: " + balance);
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    int amt = sc.nextInt();
                    if (amt <= balance) balance -= amt;
                    else System.out.println("Insufficient Balance");
                    break;
            }
        } while (choice != 4);
    }
}
