package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
//        Add carModel (String), driverName (String), licenseNum (String), speed (short),
//        isAutomatic (boolean), licenseClass (char).
        String carModel;
        carModel = "Kia Optima";
        String driverName;
        driverName = "William Groppel";
        String licenseNum;
        licenseNum = "12345678";
        short speed;
        speed = 85;
        boolean isAutomatic;
        isAutomatic = true;
        char licenseClass;
        licenseClass = 'C';

        System.out.println("Car model: " + carModel);
        System.out.println(driverName + " is driving.");
        System.out.println(driverName + " is driving a " + carModel);
        System.out.println("Current speed is " + speed + "mph");
        System.out.println("License number: " + licenseNum);
    }
}
