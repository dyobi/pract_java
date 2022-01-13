package helloProcess;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {
    public static void main(String[] args) {
        System.out.println("<<<<< 안녕 >>>>>");
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("aopform.xml");

        HelloProcess hp = (HelloProcess) ac.getBean("helloProcessBean");

        hp.kajaDrive();
        hp.kajaDrive();
        hp.kajaDrive();
        hp.kajaTravel();
        hp.kajaTravel();

        ac.close();
    }
}
