package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        System.out.println(currentSpeed > speedLimit); // false 45 is not more than 55
        System.out.println(speedLimit < currentSpeed); // false 55 is not less than 45
        System.out.println(speedLimit == currentSpeed); // false 555 doesn't equal 45

        boolean isSpeeding = currentSpeed > speedLimit; // false 45 isn't more than 55
        System.out.println("Are you speeding? " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");

        double accountBalance = 250.25;
        double itemPrice = 300.99;
        System.out.println("can I afford? - " + (accountBalance >= itemPrice)); // true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can afford = " + canAfford);

        // decrease balance by itemPrice. using shorthand operator
        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <=0;
        System.out.println("Am I broke? - " + isBroke);
    }
}
