package thread_state_test;

public class ThreadWaitNotify {
    public static void main(String[] args) {
        ShareObject object = new ShareObject();

        ThreadA threadA = new ThreadA(object);
        ThreadB threadB = new ThreadB(object);

        threadA.start();
        threadB.start();
    }
}

// 공유 객체를 생성할 클래스
class ShareObject {
    public synchronized void actionA() {
        System.out.println("threadA의 actionA 동작");
//        notify();
//        try { wait(); } catch(Exception e) {}
    }

    public synchronized void actionB() {
        System.out.println("threadB의 actionB 동작");
//        notify();
//        try { wait(); } catch(Exception e) {}
    }
}

// ThreadA
class ThreadA extends Thread {
    private ShareObject object;

    public ThreadA(ShareObject object) {
        this.object = object;
    }

    public void run() {
        for(int i = 0; i < 5; i++) {
            object.actionA();
        }
    }
}

// ThreadB
class ThreadB extends Thread {
    private ShareObject object;

    public ThreadB(ShareObject object) {
        this.object = object;
    }

    public void run() {
        for(int i = 0; i < 5; i++) {
            object.actionB();
        }
    }
}