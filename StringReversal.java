public class StringReversal {

    public static String reverseStringBuilder(String str) {
        // Method 1: Using StringBuilder
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseLoop(String str) {
        // Method 2: Using a loop
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseRecursive(String str) {
        // Method 3: Using recursion (for practice)
        if (str.isEmpty()) {
            return "";
        } else {
            return reverseRecursive(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        String originalString = "Hello, world!";

        // Using all three methods
        String reversed1 = reverseStringBuilder(originalString);
        String reversed2 = reverseLoop(originalString);
        String reversed3 = reverseRecursive(originalString);

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed using StringBuilder: " + reversed1);
        System.out.println("Reversed using loop: " + reversed2);
        System.out.println("Reversed using recursion: " + reversed3);
    }
}
