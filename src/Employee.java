public class Employee {
    public int id;
    public String name;
    public String department;
    public double salary;

    public Employee(int id, String name, String department,double salary){
        this.id=id;
        this.department=department;
        this.name=name;
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
