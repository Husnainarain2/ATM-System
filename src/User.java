import java.util.Scanner;

public class User extends Account {

  public  static void main(String[] args) {
      User account = new User();
      Scanner input = new Scanner(System.in);
      int checkpin;
      int choice;
      int cash;

      System.out.print("Set Your Account Name:");
      account.User_Name = input.nextLine();
      System.out.print("\n Enter Pin:");
      int pin = input.nextInt();
      account.setPin(pin);
      System.out.println("Verify your pin");
      System.out.print("Pin Number:");
      checkpin = input.nextInt();
      if (checkpin == pin) {

          do {
              System.out.println("1:Show Balance");
              System.out.println("2:Add Balance");
              System.out.println("3:Withdraw Cash");
              System.out.println("4:Show details");
              System.out.println("5:Exits \n");
              System.out.print(" Enter the choice :");
               choice = input.nextInt();
              switch (choice) {
                  case 1:
                      account.Show_Balance(checkpin);
                      break;
                  case 2:
                      System.out.print("Enter amount to add in your account:");
                       cash=input.nextInt();
                      account.addBalance(cash);
                      break;
                  case 3:
                      System.out.print("Enter the cash for withdraw:");
                      cash=input.nextInt();
                      account.creditAmount(cash);
                      break;
                  case 4:
                      System.out.print("your Account details ");
                      account.displayDetails();
                      break;
                  default:
                      System.out.println("Thanks you so much for using our Service");
                      break;
              }

          }while (choice<5);

      }else {
          System.out.println("Your Pin is invalid please Enter correct pin;");
      }
  }
}
