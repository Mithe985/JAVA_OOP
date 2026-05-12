class Wallet{
    public static int count=1;
    private final int id;
    private long balance;

Wallet(){
    this.id=count++;
    this.balance=0;
}
Wallet(long initialBalance){
    this.id=count++;
    this.balance=initialBalance;
}
void deposit(long amount){
    balance +=amount;
}
void withdraw(long amount){
    balance -=amount;
}

long getBalance(){
    return balance;
}
long getId(){
    return id;
}
}

class WalletApp{
    public static void main(String[] args) {
        Wallet w1=new Wallet();
        Wallet w2=new Wallet();

        w1.deposit(500);
        w2.withdraw(200);

        System.out.println(w1.getId()+w1.getBalance());
        System.out.println(w2.getId()+w2.getBalance());
    }
}