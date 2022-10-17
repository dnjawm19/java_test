package synchronized_test;

public class User4 extends Thread{
    private Calculator2 calculator2;

    public void setCalculator(Calculator2 calculator2){
        this.setName("User4");
        this.calculator2 = calculator2;
    }

    public void run(){
        for(int i=0; i<5; i++) {
            calculator2.setMemory(150);
        }
    }
}
