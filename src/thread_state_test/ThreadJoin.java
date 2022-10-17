package thread_state_test;

public class ThreadJoin {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();

        sumThread.setEnd(100);
        sumThread.start();

        //메인 스레드는 sumThread가 끝날 때 까지 대기
//        try {
//            sumThread.join();
//        } catch (Exception e) {}

        System.out.println("1부터 " + sumThread.getEnd() + "까지 합 : "+ sumThread.getSum());
//        System.out.println("1부터 " + sumThread.getEnd() + "까지 합 : "+ sumThread.getSum());
    }
}

class SumThread extends Thread {
    private long sum;
    private int end;

    public long getSum() {
        return sum;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void run() {
        for (int i = 0; i <= end; i++) {
            sum += i;
        }
    }
}