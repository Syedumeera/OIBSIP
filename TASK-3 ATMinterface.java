import java.util.Scanner;
public class AtmInterface {
	    public static void main(String[] args) {
	        int balance = 100000; // Initial balance
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("Automated Teller Machine");
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose an operation: ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter amount to withdraw: ");
	                    int withdrawAmount = sc.nextInt();
	                    if (balance >= withdrawAmount) {
	                        balance -= withdrawAmount;
	                        System.out.println("Please collect your money.");
	                    } else {
	                        System.out.println("Insufficient balance.");
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    int depositAmount = sc.nextInt();
	                    balance += depositAmount;
	                    System.out.println("Money successfully deposited.");
	                    break;

	                case 3:
	                    System.out.println("Balance: " + balance);
	                    break;

	                case 4:
	                    System.out.println("Exiting ATM. Thank you!");
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	            }
	        }
	    }
	}



