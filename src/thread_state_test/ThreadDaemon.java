package thread_state_test;

public class ThreadDaemon {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            Thread.sleep(3500);
        }catch (InterruptedException e){}

        System.out.println("메인 스레드 종료");
    }
}

class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("저장함");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                break;
            }
            save();
        }
    }
}