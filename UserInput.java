import java.util.Scanner;
public class UserInput{
    public static void main(String args[]){
        System.out.println("Taking Input from the User"); 
        Scanner in = new Scanner(System.in); 
        int a = in.nextInt();
        float b = in.nextFloat();
        float sum = a+b;
        System.out.println("The sum of two numbers is: "+sum);
    }
    
}
