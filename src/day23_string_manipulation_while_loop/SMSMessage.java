package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Saim] From number<+1(222) 333-4444> Message:{Hello, team.}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1, end));
        String sender = message.substring(start+1, end);
        System.out.println("Sender = " + sender);

        String mobile = message.substring( message.indexOf("<")+1, message.indexOf(">") );
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);

        System.out.println(" Fikret ".trim());
        sender = sender.trim();
        if(sender.equals("Saim")) {
            System.out.println("Message from Saim about quiz.");
        } else {
            System.out.println("No new message.");
        }
    }
}
