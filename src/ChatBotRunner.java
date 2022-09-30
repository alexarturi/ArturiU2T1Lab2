public class ChatBotRunner {
    public static void main (String [] args){
        ChatBot debbie = new ChatBot("Debbie",5);
        debbie.greeting("Alex");
        debbie.weather();
        System.out.println("I do know that 10 feet is equal to " + debbie.convertFeetToMeters(10) + " meters.");
        debbie.favoriteNumber(64);
        System.out.println("1 + 2 + 3 = " + debbie.addNumbers(1, 2, 3));
        System.out.println("1 * 2 * 3 = " + debbie.multiplyNumbers(1,2,3));
        debbie.worstSubject("English");
        System.out.println(debbie.goodbye());
    }
}
