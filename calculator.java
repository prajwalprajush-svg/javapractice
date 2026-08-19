import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 50 && num <= 100) {
            System.out.println("Greater than 50");
        }
        else if (num > 100 && num <= 500) {
            System.out.println("Greater than 100");
        }
        else if (num > 500) {
            System.out.println("Greater than 500");
        }
        else {
            System.out.println("Less than or equal to 50");
        }
    }
}