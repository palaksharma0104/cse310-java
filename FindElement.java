public class FindElement {

    // Method to find element in an array
    public static boolean findElement(int[] arr, int target) {
        // Iterate through the array
        for (int num : arr) {
            // Check if current element equals target
            if (num == target) {
                return true; // Element found
            }
        }
        return false; // Element not found
    }

    // Main method
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int target = 6;
        
        // Check if element exists in array
        if (findElement(array, target)) {
            System.out.println("Element " + target + " found in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
