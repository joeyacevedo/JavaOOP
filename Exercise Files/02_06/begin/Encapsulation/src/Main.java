public class Main {

  public static void main(String[] args) {

      BankAccount joeyAccount = new BankAccount("Joey", 50000);

      joeyAccount.withdrawBalance(20000);

      joeyAccount.printBalance();
  }
}
