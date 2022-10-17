package thread_state_test;

public class ThreadYield {
    public static void main(String[] args) {
        Yield1 yield1 = new Yield1();
        Yield1 yield2 = new Yield1();

        yield1.setid(1);
        yield2.setid(2);

        yield1.start();
        yield2.start();

    }
}

class Yield1 extends Thread {
    private int id;

    public void setid(int id) {
        this.id = id;
    }
    public void run() {
        for(int i = 0;i<10;i++) {
            if(i==4){
                System.out.println(id);
                Thread.yield();
            }else{
                System.out.println(id);
            }
        }

    }
}