class Person{
    void message(){
        System.out.println("This is Person");
    }
}
class Student extends Person{
    void message(){
        System.out.println("This is Student");
    }
    void display(){
        message();
        super.message();
    }
}
public class SuperWithMethod {
    public static void main(String[] args) {
        Student s=new Student();
        s.display();

    }
}
