public class SortArray {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        System.out.println("Original Array: ");
        printArray(arr);

        // Sort the array using bubble sort
        bubbleSort(arr);

        System.out.println("\nSorted Array: ");
        printArray(arr);
    }

    // Bubble sort implementation
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
