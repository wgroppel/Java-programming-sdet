package day05_primitives_concatation;

public class CellPhone {
    public static void main(String[] args){
        String brand = "Apple";
        String model = "11 Pro Max";
        String color = "Green";
        double price = 899.99;
        int storage = 256;
        boolean hasCamera = true;

        //System.out.println(brand);
        //System.out.println(model);
//      Now create with message using +!
        System.out.println("Brand:   " + brand);
        System.out.println("Model:   " + model);
        System.out.println("Color:   " + color);
        System.out.println("Price:   $" + price);
        System.out.println("Storage: " + storage + "GB");
    }
}
