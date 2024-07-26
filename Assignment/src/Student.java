public class Student {
    private String studentID;
    private String name;
    private int age;
    private double gpa;

    public Student(String studentID, String name, int age, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "StudentID: " + studentID + ", Name: " + name + ", Age: " + age + ", GPA: " + gpa;
    }
}
