package pkg;

public class Insa {
    private String name;
    private String tel;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String insaGo(String str) {
        return this.name + " 님\n" + "id는 " + id + "고\n전화번호가 " + this.tel + " 네요\n" + str;
    }
}
