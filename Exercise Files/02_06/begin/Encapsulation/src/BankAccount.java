public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double startingBalance){
        this.owner = owner;
        this.balance = Math.max(startingBalance, 0);
    }

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }

    public void printBalance(){
        System.out.println("Here's your balance - " + balance);
    }

    public void withdrawBalance(double withdrawalAmount){
        if(withdrawalAmount <= this.balance){
            this.balance = this.balance - withdrawalAmount;
        }
    }

    public void depositBalance(double depositAmount){
        if (depositAmount > 0){
            this.balance = this.balance - depositAmount;
        }
    }
}
