package pkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Insa {

    @Autowired @Value("홍길동")
    private String name;

    public String helloName(String str) {
        return this.name + " 님\n" + str;
    }

}