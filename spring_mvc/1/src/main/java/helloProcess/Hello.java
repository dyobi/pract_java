package helloProcess;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;

public class Hello {

    public static void main(String[] args) {

        AbstractApplicationContext ac = new GenericXmlApplicationContext("jdbctemplate.xml");
        SawonDao sd = (SawonDao) ac.getBean("sawonDaoBean");

        ArrayList<Object> arr = sd.selectAll();
        Iterator<Object> it1 =  arr.iterator();

        while (it1.hasNext()) {
            SawonVO sv = (SawonVO) it1.next();
            System.out.println(sv.getName() + "\t" + sv.getTel());
            System.out.println();
        }

        ac.close();

    }

}
