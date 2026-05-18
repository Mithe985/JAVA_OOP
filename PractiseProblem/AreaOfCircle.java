import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String [] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter radius :"); 
      double r=input.nextDouble();
      double area=Math.PI*Math.pow(r,2);
      System.out.println("Area is : "+area);
      input.close();
    }
}