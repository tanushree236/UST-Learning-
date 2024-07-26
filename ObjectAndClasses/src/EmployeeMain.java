public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setEmployeeId(193);
        e1.getSalary(90000.00);

        Employee e2=new Employee();
        e2.setEmployeeId(200);
        e2.getSalary(60000);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println("Employee ID is "+e1.getEmplyoleeId()+" and salary is "+e1.getSalary(60000));
        System.out.println("Employee ID is "+e2.getEmplyoleeId()+" and salary is "+e2.getSalary(60000));
    }
}
