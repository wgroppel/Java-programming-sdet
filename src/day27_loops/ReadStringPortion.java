package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,cat,red_car,java,selenium";

        for(int i = 0; i < list.length()-2; i++) {
            System.out.println(list.substring(i, i + 3));
        }
    }
}
