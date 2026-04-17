public class Bankaccount {
    private int balance;
    public Bankaccount(int balance){
        this.balance=balance;
    }
    public int deposit(int amount){
        balance+=amount;
        System.out.print("Balance after deposit : ");
        return balance;
    }
    public int withdrawal(int amount){
        if(amount>balance){
            System.out.print("Balance is Not sufficient for withdrawal, so the available balance : ");
            return balance;
        }
        else{
        balance-=amount;
        System.out.print("Balance after withdrawal : ");
        return balance; }
    }
    public int currentbalance(){
        System.out.print("Current balance : ");
        return balance;
    }
    public static void main(String[] args) {
        Bankaccount b = new Bankaccount(1500);
        System.out.println(b.currentbalance());
        System.out.println(b.deposit(500));
        System.out.println(b.withdrawal(1000));
        System.out.println(b.withdrawal(2000));
        System.out.println(b.currentbalance());
    }
}
