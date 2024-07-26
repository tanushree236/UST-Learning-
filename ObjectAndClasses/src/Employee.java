public class Employee {
    long EmpId;
    double salary;
    void setEmployeeId(long id){
        EmpId=id;
    }
    long getEmplyoleeId (){
        return EmpId;
    }
    void setSalary(double sal){
        salary=sal;
    }
    double getSalary(double v){
        return salary;
    }
    @Override
    public String toString(){
        String s=EmpId+" "+salary;
        return s;
    }
}
