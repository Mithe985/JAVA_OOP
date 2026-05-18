import java.util.Scanner;

public class EquilateralTraingle {

    public static void main(String [] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter length :"); 
      double a=input.nextDouble();
      double area=(Math.sqrt(3)/4)*Math.pow(a,2);
      System.out.println("Area is : "+area);
      input.close();
    }
}