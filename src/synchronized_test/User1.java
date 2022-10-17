package synchronized_test;

public class User1 extends Thread{
    private Calculator calculator;

    public void setCalculator(Calculator calculator){
        this.setName("User1");
        this.calculator = calculator;
    }

    public void run(){
        for(int i=0; i<5; i++) {
            calculator.setMemory(100);
        }
    }
}
