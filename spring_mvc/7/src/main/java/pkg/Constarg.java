package pkg;

import javax.annotation.Resource;

public class Constarg {
    @Resource(name="insaBean")
    private Insa insa;

    public String kajaHello(String str) {
        return insa.helloName(str);
    }
}
