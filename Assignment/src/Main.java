import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter command (add, remove, search, sort, display, exit): ");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter GPA: ");
                    double gpa = Double.parseDouble(scanner.nextLine());
                    manager.addStudent(new Student(id, name, age, gpa));
                    break;

                case "remove":
                    System.out.print("Enter student ID to remove: ");
                    id = scanner.nextLine();
                    manager.removeStudentById(id);
                    break;

                case "search":
                    System.out.print("Search by (id/name): ");
                    String searchType = scanner.nextLine();
                    if (searchType.equalsIgnoreCase("id")) {
                        System.out.print("Enter student ID: ");
                        id = scanner.nextLine();
                        Student student = manager.searchStudentById(id);
                        System.out.println(student != null ? student : "Student not found");
                    } else if (searchType.equalsIgnoreCase("name")) {
                        System.out.print("Enter name: ");
                        name = scanner.nextLine();
                        List<Student> students = manager.searchStudentsByName(name);
                        manager.displayStudents(students);
                    }
                    break;

                case "sort":
                    System.out.print("Sort by (id/name/age/gpa): ");
                    String sortType = scanner.nextLine();
                    Comparator<Student> comparator;
                    switch (sortType.toLowerCase()) {
                        case "id":
                            comparator = StudentComparators.byID();
                            break;
                        case "name":
                            comparator = StudentComparators.byName();
                            break;
                        case "age":
                            comparator = StudentComparators.byAge();
                            break;
                        case "gpa":
                            comparator = StudentComparators.byGPA();
                            break;
                        default:
                            System.out.println("Invalid sort criteria");
                            continue;
                    }
                    List<Student> sortedStudents = manager.sortStudents(comparator);
                    manager.displayStudents(sortedStudents);
                    break;

                case "display":
                    manager.displayStudents(manager.sortStudents(StudentComparators.byID()));
                    break;

                case "exit":
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
