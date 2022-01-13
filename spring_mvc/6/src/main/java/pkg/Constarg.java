package pkg;

import org.springframework.beans.factory.annotation.Autowired;

public class Constarg {
    @Autowired
    private Insa insa;

    public String kajaHello(String str) {
        return insa.helloName(str);
    }
}
