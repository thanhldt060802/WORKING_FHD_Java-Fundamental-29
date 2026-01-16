import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(String rawStudent) {
        this.extractFromString(rawStudent);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    // Chuyển đối tượng Student về chuỗi thô để ghi
    public String convertToString() {
        return String.format("%s, %s, %d", this.id, this.name, this.age);
    }

    // Chiết xuất chuỗi thô rawStudent về thông tin của đối tượng Student
    public void extractFromString(String rawStudent) {
        String[] rawInfos = rawStudent.split(", ");
        this.id = rawInfos[0];
        this.name = rawInfos[1];
        this.age = Integer.parseInt(rawInfos[2]);
    }
    
}
