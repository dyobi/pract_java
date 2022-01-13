package pkg;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Hello {
    public static void main(String[] args) {

        System.out.println("<<<<< 안녕 >>>>>");
        String str = "Hello, Spring";

        GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("applicationContext1.xml");

        Insa insa = gxac.getBean("insaBean", Insa.class);
        System.out.println(insa.helloName(str));

        Constarg con = gxac.getBean("constargBean", Constarg.class);
        System.out.println(con.kajaHello(str));

        gxac.close();

    }
}
