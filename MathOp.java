import java.util.Scanner;

public class MathOp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose the mathematical operation you want to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int userChoice = in.nextInt();

        while (userChoice < 1 || userChoice > 4) {
            System.out.println("Invalid choice. Please enter a number between 1 and 4:");
            userChoice = in.nextInt();
        }

        System.out.println("Enter any two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();

        if (userChoice == 1) {
            int sum = a + b;
            System.out.println("The sum of the two numbers is: " + sum);
        } else if (userChoice == 2) {
            int difference = a - b;
            System.out.println("The difference of the two numbers is: " + difference);
        } else if (userChoice == 3) {
            int product = a * b;
            System.out.println("The product of the two numbers is: " + product);
        } else if (userChoice == 4) {
            
            if (b == 0) {
                System.out.println("Division by zero is not allowed!");
            } else {
                double quotient = (double) a / b; // Cast to double for accurate division
                System.out.println("The division result of the two numbers is: " + quotient);
            }
        } else {
            System.out.println("An unexpected error occurred."); // More informative error message
        }
    }
}

