import java.util.Scanner;

public class AreaTraingle {

    public static void main(String [] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter side a :"); 
      double a=input.nextDouble();
      System.out.println("Enter side b :"); 
      double b=input.nextDouble();
      System.out.println("Enter side c :"); 
      double c=input.nextDouble();
      double s=(a+b+c)/2;
      double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("Area is : "+area);
      input.close();
    }
}