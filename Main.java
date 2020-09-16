import java.util.Scanner;

/**
 * Calculates how much of a discount each customer gets
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // get how much money the customer spent
    System.out.println("Please enter the amount the customer spent");
    double moneySpent = input.nextDouble();

    // Constant for 10% off
    final double TEN_PERCENT = 40;

    // Constant for 20% off low
    final double TWENTY_LOW = 40.01;

    // Constant for 20% off high
    final double TWENTY_HIGH = 80;

    // Constant for 30% off low
    final double THIRTY_LOW = 80.01;

    // Constant for 30% off high
    final double THIRTY_HIGH = 120;

    // Constant for 40% off
    final double FOURTY_PERCENT = 120.01;

    // find out how much of a discount the customer gets
    if (moneySpent <= TEN_PERCENT) {
    double savedMoney = moneySpent * 0.10;
    double finalTotal = moneySpent - savedMoney;
    System.out.println("They will recieve 10% off");
    System.out.println("They will save " + "$" + savedMoney);
    System.out.println("The new total is " + "$" + finalTotal);
    } else if (moneySpent >= TWENTY_LOW && moneySpent <= TWENTY_HIGH) {
      double savedMoney = moneySpent * 0.20;
      double finalTotal = moneySpent - savedMoney;
      System.out.println("They will recieve 20% off");
      System.out.println("They will save " + "$" + savedMoney);
      System.out.println("The new total is " + "$" + finalTotal);
    } else if (moneySpent >= THIRTY_LOW && moneySpent <= THIRTY_HIGH) {
      double savedMoney = moneySpent * 0.30;
      double finalTotal = moneySpent - savedMoney;
      System.out.println("They will recieve 30% off");
      System.out.println("They will save " + "$" + savedMoney);
      System.out.println("The new total is " + "$" + finalTotal);
    } else {
      double savedMoney = moneySpent * 0.40;
      double finalTotal = moneySpent - savedMoney;
      System.out.println("They will recieve 40% off");
      System.out.println("They will save " + "$" + savedMoney);
      System.out.println("The new total is " + "$" + finalTotal);
    }



  }
}
