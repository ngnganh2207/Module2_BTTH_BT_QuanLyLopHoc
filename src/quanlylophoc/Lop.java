package quanlylophoc;

public class Lop {
    private int id=00;
    private String name= "9A0";

    public Lop() {
    }

    public Lop(String name) {
        this.name = name;
    }

    public Lop(int id) {
        this.id = id;
    }

    public Lop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Du Lieu Lop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
