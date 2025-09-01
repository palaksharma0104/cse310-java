import java.util.Scanner;
public class GreatestNum{
    public static void main(String args[]){
        System.out.println("Enter any three numbers!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        if(a>=b && b>=c)
        System.out.println("The greatest number is: "+a);
        if(b>=c && b>=a)
        System.out.println("The greatest number is: "+b);
        else
        System.out.println("The greatest number is: "+c);
    }
}

