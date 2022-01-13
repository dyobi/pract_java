package pkg;

import configurationbean.ConfigurationBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Hello {
    public static void main(String[] args) {

        System.out.println("<<<<< 안녕 >>>>>");

        AbstractApplicationContext ac = new AnnotationConfigApplicationContext(ConfigurationBean.class);

//        Sawon sawon = ac.getBean("sawonBean", Sawon.class);

        Hobby hobby = ac.getBean("hobbyBean", Hobby.class);

        System.out.println(hobby);
        ac.close();

    }
}
