import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StudentCollections {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(20, "Alice"));
        students.add(new Student(22,"Bob"));
        students.add(new Student(19,"Charlie"));
        students.add(new Student(21,"Diana"));
        System.out.println(students);
        System.out.println("-----------------After Sorting----------------");
        Collections.sort(students);
        System.out.println(students);

    }
}
