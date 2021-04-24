package day04_variables_intro;

public class AmazonItem {
    public static void main(String[] args){
        String description = "ASUS ROG STRIX NVIDIA GeForce RTX 3080";
        int ratingsCount = 87;
        double price = 949.99;
        String seller = "Newegg";
        boolean prime = true;

        System.out.println("----------PRODUCT INFORMATION----------");
        System.out.println(description);
        System.out.print("***** ");
        System.out.print(ratingsCount);
        System.out.print("                       $");
        System.out.println(price);
        System.out.print("Seller: ");
        System.out.print(seller);
        System.out.print("             Prime: ");
        System.out.println(prime);
        System.out.println("---------------------------------------");

    }
}
