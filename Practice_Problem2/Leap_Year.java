import java.util.Scanner;

public class Leap_Year {
    public static void main(String [] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Year : ");
     int y=sc.nextInt();
     Boolean f=false;
     if(y%4==0 || y%400==0) f=true;
     if(f) System.out.println("It's a leap year!");
     else System.out.println("It's not a leap year!");
     sc.close();
    }
}