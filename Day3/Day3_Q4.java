package training1;
import java.util.Scanner;
public class Day3_Q4 {
	static double balance = 0.0;
	static int pin = 1234;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
        
		while(true) {
			System.out.println("\n--- ATM MENU ---");
	        System.out.println("1) Deposit");
	        System.out.println("2) Withdraw");
	        System.out.println("3) Check Balance");
	        System.out.println("4) Change PIN");
	        System.out.println("5) Exit");
	        System.out.print("Enter option: ");
	        
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				deposit(sc);
				break;
				
			case 2:
                withdraw(sc);
                break;

            case 3:
                printBalance();
                break;

            case 4:
                changePin(sc);
                break;
                
			case 5:
				System.out.println("Thank you. visit again");
				return;
			default:
				System.out.println("invalid option. try again");
				continue;
			}
		}

	}
	static void deposit( Scanner sc) {
		System.out.print("Enter amount: ");
		int amount = sc.nextInt();
		if(amount>0) {balance = balance+amount;
		System.out.printf("Deposited. Balance: %.2f%n",balance);}
		else {System.out.print("invalid amount");
		return;}
	
}
	static void withdraw( Scanner sc) {
		System.out.print("Enter pin: ");
		int pin1 = sc.nextInt();
		if(pin1 == pin) {
			System.out.print("Enter amount: ");
			int amount = sc.nextInt();
			if (amount <= 0) {
	            System.out.println("Invalid amount.");
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        } else {
	            balance -= amount;
	            System.out.printf("Withdrawn. Balance: %.2f%n", balance);
	        }
		}
		else {
			System.out.println("Incorrect PIN.");
			return;
		}
	}
	static void printBalance() {
        System.out.printf("Current Balance: %.2f%n", balance);
    }
	static void changePin(Scanner sc) {
	    System.out.print("Enter current PIN: ");
	    int oldPin = sc.nextInt();

	    if (oldPin != pin) {
	        System.out.println("Incorrect PIN.");
	        return;
	    }

	    System.out.print("Enter new PIN: ");
	    pin = sc.nextInt();  

	    System.out.println("PIN changed successfully.");
	}
	
}
// %.2f%n this is used for two decimal places . 
// we wrap switch inside while loop. 