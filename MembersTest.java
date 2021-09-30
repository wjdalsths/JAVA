package _9_13;
class Members {
    private String name;
    private String id;
    private String pw;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public int getAge() {
        return age;
    }

    public Members(String name, String id, String pw, int age) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }
}
public class MembersTest {
    public static void main(String[] args) {

    }
}
