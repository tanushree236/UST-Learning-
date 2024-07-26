import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id,other.id);
    }

    private String name;

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
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
    public String toString(){
        return "Student id: "+id+" Name: "+name;
    }

}
