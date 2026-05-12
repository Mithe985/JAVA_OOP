class Shopping{
    String name;
    double price;
    double quantityPurchased;

    static int itemCount=0;
     double totalPrice=0;
 Shopping(String name,int initialTotalPrice,double quantityPurchased){
    this.name=name;
  this.totalPrice=initialTotalPrice;
  this.quantityPurchased=quantityPurchased;


    }
   
    void PriceCalculation(){
        totalPrice=this.totalPrice*this.quantityPurchased;
    }

    double getTotalPrice(){
        return totalPrice;
    }
   
}
public class LabTest {
public static void main(String[] args) {
    Shopping s1=new Shopping("Drinks",300,30.2);
    Shopping s2=new Shopping("Chips",200 , 12.20);
    Shopping s3=new Shopping("Biscuits",100 ,22.2 );
    s1.PriceCalculation();
    s2.PriceCalculation();
    s3.PriceCalculation();

    System.out.println("Drinks:" +s1.getTotalPrice());
    System.out.println("Chips:" +s2.getTotalPrice());
    System.out.println("Biscuits:" +s3.getTotalPrice());
}
    
}