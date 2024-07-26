import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentById(String studentID) {
        students.removeIf(student -> student.getStudentID().equals(studentID));
    }

    public Student searchStudentById(String studentID) {
        return students.stream()
                .filter(student -> student.getStudentID().equals(studentID))
                .findFirst()
                .orElse(null);
    }

    public List<Student> searchStudentsByName(String name) {
        return students.stream()
                .filter(student -> student.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Student> sortStudents(Comparator<Student> comparator) {
        List<Student> sortedList = new ArrayList<>(students);
        mergeSort(sortedList, comparator, 0, sortedList.size() - 1);
        return sortedList;
    }

    private void mergeSort(List<Student> list, Comparator<Student> comparator, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(list, comparator, left, mid);
            mergeSort(list, comparator, mid + 1, right);
            merge(list, comparator, left, mid, right);
        }
    }

    private void merge(List<Student> list, Comparator<Student> comparator, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        List<Student> leftList = new ArrayList<>(n1);
        List<Student> rightList = new ArrayList<>(n2);

        for (int i = 0; i < n1; i++) {
            leftList.add(list.get(left + i));
        }
        for (int j = 0; j < n2; j++) {
            rightList.add(list.get(mid + 1 + j));
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (comparator.compare(leftList.get(i), rightList.get(j)) <= 0) {
                list.set(k, leftList.get(i));
                i++;
            } else {
                list.set(k, rightList.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            list.set(k, leftList.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            list.set(k, rightList.get(j));
            j++;
            k++;
        }
    }

    public void displayStudents(List<Student> studentList) {
        studentList.forEach(System.out::println);
    }
}
