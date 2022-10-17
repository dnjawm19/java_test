package synchronized_test;

public class User3 extends Thread{

    public void run(){
        for(int i=0; i<5; i++) {
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e) {}
            System.out.println("user3");
        }
    }
}