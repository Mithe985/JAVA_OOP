class WalletApp{
   static long deposit(long balance,long amount){
      return balance+amount;
   }
   static long withdraw(long balance,long amount){
      return balance-amount;
   }

   public static void main(String[] args) {
      long balance1=1000;
      long balance2=500;

      balance1=deposit(balance1,500);
      balance2=withdraw(balance2,200);

      System.out.println(balance1);
      System.out.println(balance2);

   }

   
}