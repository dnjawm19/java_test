package synchronized_test;

public class ThreadName {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator2 calculator2 = new Calculator2();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

//        for (int i = 0; i < 2; i++) {
//            User1 user1 = new User1();
//            user1.setCalculator(calculator);
//            user1.start();
//        }

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();

        User3 user3 = new User3();
        user3.start();

//        for (int i = 0; i < 2; i++) {
//            User3 user3 = new User3();
//            user3.start();
//        }

        User4 user4 = new User4();
        user4.setCalculator(calculator2);
        user4.start();
    }
}
