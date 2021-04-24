package day13_condition_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;

        if (isHungry) {
            System.out.println("I am Hangry, I will go get food.");
            System.out.println("Then code java!");
        } else {
            System.out.println("I am not hungry, I will keep coding java!");
        }

        double price = 130.44;
        boolean isAffordable = price <= 200; // 200 is budget.

        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("I can afford it, let's buy!");
        } else {
            System.out.println("Too expensive, let's keep coding java!");
        }

        boolean isRemoteJob = true;
        // if not remote job print "Sorry I'm not interested"
        // otherwise, print "Sure, I am interested, what is the interview process?"
        if (isRemoteJob != true) {
            System.out.println("Sorry, I'm not interested.");
        } else {
            System.out.println("Sure, I am interested, what is the interview process?");
        }

    }
}
