import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("Enter your Aadhaar number: ");
        long aadhaar = sc.nextLong();


        System.out.print("Enter your DOB: ");
        String dob = sc.nextLine();

        System.out.print("Write a paragraph about yourself: ");
        String paragraph = sc.nextLine();

        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Aadhaar Number: " + aadhaar);
        System.out.println("DOB: " + dob);
        System.out.println("About Yourself: " + paragraph);

      
    }
}