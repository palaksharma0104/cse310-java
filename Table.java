import java.util.Scanner;
public class Table {
    public static void main(String args[]){
        System.out.println("Choose a number whose table you want to see, make sure the number is less than 10!");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num>=10){
            for(int i =1; i<=10; i++){
                int mul = num*i;
                System.out.println(num + " x " +i+ " = " +mul);
            }
        }

    }
    
}

