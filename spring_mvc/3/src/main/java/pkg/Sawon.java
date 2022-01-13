package pkg;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Sawon {
    private String id;
    private String name;

    @Override
    public String toString() {
        return "id는 " + id + ", name은 " + name;
    }
}
