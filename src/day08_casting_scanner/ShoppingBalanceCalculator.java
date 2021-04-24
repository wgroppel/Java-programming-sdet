package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;

        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;

        double remainingBalance = balance - price1 - price2 - price3;
        System.out.println(remainingBalance);
//=======================================================================
        double balance2 = 420.69;

        double price4 = 69.75;
        double price5 = 105.75;
        double price6 = 175.25;

        double remainingBalance2 = balance2 - (price4 + price5 + price6);
        System.out.println(remainingBalance2);

        System.out.println("Your initial balance is: $" + balance2);
        System.out.println("Your remaining balance is: $" + remainingBalance2);
//        Convert to int to not show change. Use Casting!
        int balanceWithNoChange = (int)remainingBalance;
        System.out.println("Your remaining balance without change is: $" + balanceWithNoChange);
    }
}
