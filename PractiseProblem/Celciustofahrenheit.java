import java.util.Scanner;

public class Celciustofahrenheit {

    public static void main(String [] args) {
    
      Scanner input=new Scanner(System.in);
      System.out.println("Enter temperature :"); 
      double t=input.nextDouble();
      double fT=((9.0*t)/5.0)+32.0;
      System.out.println("Temperature is : "+fT);
      input.close();
    }
}

