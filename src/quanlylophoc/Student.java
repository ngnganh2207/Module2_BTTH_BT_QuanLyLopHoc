package quanlylophoc;

public class Student {
    private int id;
    private String name;
    private String gender;
    private int age;
    private Lop lop= new Lop();

    public Student() {
    }

    public Student(int id, String name, String gender, int age, Lop lop) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.lop = lop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Thông tin của Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", lop=    " + lop +
                '}';
    }
}
