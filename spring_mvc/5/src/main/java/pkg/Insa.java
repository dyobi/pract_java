package pkg;

public class Insa {
    private String name;

    public Insa() {}

    public Insa(String name) {
        this.name = name;
    }

    public String helloName(String str) {
        return name + " 님 안녕 하세요\n";
    }
}
