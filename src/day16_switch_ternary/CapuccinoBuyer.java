package day16_switch_ternary;

public class CapuccinoBuyer {
    public static void main(String[] args) {
        String size = "venti";
        double price = 0.0;
        int calories = 0;

//        if (size.equals("tall")) {
//        }
        switch(size) {
            case "tall":
                System.out.println("Tall cappuccino please");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande cappuccino please");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println("Venti cappuccino please");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("We don't serve that "+size+" Cappuccino");
                break; //optional if default is at the end
        }

        System.out.println("Total price: $" + price);
        System.out.println("You will consume "+ calories +" cals of energy");
    }
}
