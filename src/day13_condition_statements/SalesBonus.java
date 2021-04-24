package day13_condition_statements;

public class SalesBonus {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 2000.55;

        if (salesAmount <= 2000) {
            System.out.println("Good job, you qualify for a bonus!");
            bonus = 50.00;
        } else {
            System.out.println("Good job, you qualify for a FULL bonus!");
            bonus = 100.00;
        }
        System.out.println("You're total bonus: $" + bonus);
    }
}
