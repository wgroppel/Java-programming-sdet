package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
//        Interview problem...
//        Find duplicates and count.
//        Find unique characters only appearing once.
//        Print character and number of occurrences.
//              ^ NOT DONE IN THIS EXAMPLE ^
                    // 0123
        String word = "java";

        for (int i = 0; i < word.length(); i++){
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }

        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }


    }
}
