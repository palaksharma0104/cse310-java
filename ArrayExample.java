import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Declare an array of integers of the given size
        int[] arr = new int[size];
        
        // Accept elements into the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Print the elements of the array
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Close the scanner
        scanner.close();
    }
}


