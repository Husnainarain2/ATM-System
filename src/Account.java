public class Account {
   public  String User_Name;
  private  long balance;
  private  int pin;

  public int  setPin(int pin){
      this.pin=pin;
      return pin;
  }
  public long addBalance(int Amount){
      balance=balance+Amount;
      return balance;
  }
  public void creditAmount(int withdraw) {
      if (withdraw > 0 && withdraw <= balance) {
          System.out.println("you withdraw that amount in your amount: " + withdraw + "\n");
          System.out.println("Your remaining Balance in your Account is :" + (balance - withdraw));
      }
      else {
          System.out.println("You have no Balance in your account !! Invalid ");
      }
  }
  public void Show_Balance(int pin){
      if (pin==this.pin){
          System.out.println("Your Balance is :"+balance);
      }
      else {
          System.out.println("Invalid pin please inter the pin again");
      }

    }
    public void displayDetails(){
        System.out.println("Account Holder:"+ User_Name );
        System.out.println("Account Balance :"+ balance);
    }
}
