package pkg1;

class ThreadClass1 extends Thread {
    public void run() {
        System.out.println(getName() + " 나는 나야");
        System.out.println("All you need is Love~~~");
    }
}

class ThreadClass2 extends Thread {
    public void run() {
        System.out.println(getName() + " 나도 너 아니거든");
        System.out.println("Love is All you need~~~");

    }
}

public class ThreadMainClass {

    public static void main(String[] args) {
        Thread tc1 = new ThreadClass1();
        Thread tc2 = new ThreadClass2();

        tc1.start();
        tc2.start();
        System.out.println("지금 Two thread!");
    }

}
