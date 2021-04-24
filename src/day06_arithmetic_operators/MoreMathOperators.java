package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
//        Toyota (431), Honda (233), VWs (2), Tesla (20), Nissan (1), BMW (155)
//        totalCarsInParking -> should equal total cars!
//        Use int!


        String pizza = "hawaiian";
        int slices = 8;
        int people = 2;
        int slicesPerPerson = slices / people;
//        There are 2 slices per person
        System.out.println("There are " + slicesPerPerson + " slices per person.");
//        We ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each.
        System.out.println("We ordered " + pizza + " pizza with " + slices +
                " slices, " + people + " people ate " + slicesPerPerson + " slices each!");
    }
}
