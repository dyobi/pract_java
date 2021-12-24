package pkg5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerEvent {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("뭐야");
            }
        });

        timer.start();
        Thread.sleep(10000);
        timer.stop();
    }
}
