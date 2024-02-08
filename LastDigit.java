import java.util.Scanner;
public class LastDigit{
  public static void main(String args[]){
    System.out.println("Enter any number of your choice!");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int lastdig = num%10;
    System.out.println("The last digit of the entered number is: "+lastdig);
  }
}
