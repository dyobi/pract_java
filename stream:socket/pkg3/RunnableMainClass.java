package pkg3;

class RunnableClass1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread.currentThread().setName("나는 무적의 : ");
            System.out.println(Thread.currentThread().getName() + "내가 쏘고 있네");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class RunnableClass2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread.currentThread().setName("나는 무패의 : ");
            System.out.println(Thread.currentThread().getName() + "내가 쏘고 있네");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableMainClass {
    public static void main(String[] args) {
        Thread th1 = new Thread(new RunnableClass1());
        Thread th2 = new Thread(new RunnableClass2());

        th1.start();
        th2.start();
    }
}
