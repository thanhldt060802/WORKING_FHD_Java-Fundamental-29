public class Student /* implements Comparable<Student> */ {

    private Long id;
    private String name;
    private int age;

    public Student(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    /**
     * So sánh giữa 'this' và 'o'
     *  - Nếu 'this' > 'o' thì trả về số dương
     *  - Nếu 'this' < 'o' thì trả về số âm
     *  - Nếu 'this' == 'o' thì trả về số 0
     */
    // @Override
    // public int compareTo(Student o) {
    //     // if (this.age > o.age) {
    //     //     return 1;
    //     // } else if (this.age < o.age) {
    //     //     return -1;
    //     // } else {
    //     //     return 0;
    //     // }

    //     return this.age - o.age;
    // }
    
}
