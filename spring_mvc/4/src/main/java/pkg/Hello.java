package pkg;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Hello {
    public static void main(String[] args) {
        System.out.println("<<<<< 안녕 >>>>>");

        String str = "오늘 날씨 어때요?";

        GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("applicationContext.xml");

        Insa insa1 = gxac.getBean("insaBean", Insa.class);
        Insa insa2 = gxac.getBean(Insa.class);
        Insa insa3 = (Insa)gxac.getBean("insaBean");

        System.out.println(insa1.insaGo(str));
        gxac.close();
    }
}
