import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int c = 0;
    double p = 1.0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of values: ");
    int count =Integer.parseInt(sc.nextLine());
    
    while((c<count)){
      System.out.println("Enter a real number: ");
      double x =Double.parseDouble(sc.nextLine());
      c = c+1;
      p = p * x;
      }
    double gm = Math.pow(p,1.0/count);
    System.out.println("The geometric mean is: "+gm);
    
  }
}
