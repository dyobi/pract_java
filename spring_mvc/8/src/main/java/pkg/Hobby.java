package pkg;

public class Hobby {
    private Sawon sawon;

    public Hobby(Sawon sawon) {
        this.sawon = sawon;
    }

    public Sawon getSawon() {
        return sawon;
    }
    public void setSawon(Sawon sawon) {
        this.sawon = sawon;
    }

    @Override
    public String toString() {
        return "사원아이디는 " + sawon.getId() + ", 사원명은 " + sawon.getName() + "\n취미는 " + sawon.getHobby() + "야~~~";
    }
}
