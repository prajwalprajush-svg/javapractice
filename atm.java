import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int pin = 1234;

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN!");
            return;
        }

        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Amount deposited successfully.");
                    System.out.println("New Balance: ₹" + balance);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    int withdraw = sc.nextInt();

                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please collect your cash.");
                        System.out.println("New Balance: ₹" + balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}