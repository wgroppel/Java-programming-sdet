package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
//        int static = 18; Not allowed due to it being 'static' being reserved.
        int _static = 22;
        int $tatic = 44;
        int staticVar = 234;

        int salary$ = 55;
//        int 1stMonthSalary = 3000; --> ERROR, cannot start with number.
        int $ = 10;
        int _ = 3;
        System.out.println($);
        System.out.println(_);
//        Above variables work fine but aren't recommended.
//        We should use meaningful variable names.
//        int number-of-friends = 400; --> ERROR
        int numberOfFriends = 400;
        int number_of_friends = 400;
    }
}
