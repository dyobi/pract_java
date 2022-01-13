package pkgMain;

import org.springframework.context.support.GenericXmlApplicationContext;
import pkg.Sawon;

public class SawonMain {
    public static void main(String[] args) {
        GenericXmlApplicationContext ac = new GenericXmlApplicationContext("appcon.xml");
        Sawon sawon = (Sawon)ac.getBean("sawonBean");

        sawon.setId("identification");
        sawon.setName("NAME");
        System.out.println(sawon);
    }
}
