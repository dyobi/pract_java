package pkg2;

class ThreadClass1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "내가 쏘고 있당~~!!!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadClass2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "너가 쏘고 있냥~~!!!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadMainClass {
    public static void main(String[] args) {
        Thread tc1 = new ThreadClass1();
        Thread tc2 = new ThreadClass2();

        tc1.start();
        tc2.start();
    }
}
