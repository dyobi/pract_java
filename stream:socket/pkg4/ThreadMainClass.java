package pkg4;

class ThreadClass1 extends Thread {
    String kwail;

    public ThreadClass1(String kwail) {
        this.kwail = kwail;
    }

    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(kwail + " 주세요");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadClass2 extends Thread {
    String kwail;

    public ThreadClass2(String kwail) {
        this.kwail = kwail;
    }

    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(kwail + " 주세요");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadClass3 extends Thread {
    String kwail;

    public ThreadClass3(String kwail) {
        this.kwail = kwail;
    }

    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(kwail + " 주세요");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadMainClass {
    public static void main(String[] args) {
        ThreadClass1 tc1 = new ThreadClass1("사과");
        ThreadClass2 tc2 = new ThreadClass2("배");
        ThreadClass3 tc3 = new ThreadClass3("감");

        // 우선순위 : priority
        tc1.setPriority(tc1.MIN_PRIORITY);  // 1
        tc2.setPriority(tc2.NORM_PRIORITY); // default 5
        tc3.setPriority(tc3.MAX_PRIORITY);  // 10

        System.out.println(tc1.getPriority() + "\t" + tc2.getPriority() + "\t" + tc3.getPriority());

        tc1.start();
        tc2.start();
        tc3.start();
    }
}
