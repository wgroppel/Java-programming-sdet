package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
//        String reply = "accept";
//        if(hourlyRate > 45) {
//            reply = "accept";
//        }else{
//            reply = "reject";
//        }
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String todaysClass = "java";

        String teacher = (todaysClass == "java") ? "murodil" : "nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligibleToDrive = true;
        // "have DL and can drive" : "No DL cannot drive"
        String driving = isEligibleToDrive ? "have DL and can drive" : "No DL cannot drive";
        System.out.println("Can drive? = " + driving);

    }
}
