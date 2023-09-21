import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee(1, "John Doe", "Sales", 50000.0);
        employeeList.add(employee1);

        Employee employee2 = new Employee(2, "Jane Smith", "Finance", 60000.0);
        employeeList.add(employee2);

        Employee employee3 = new Employee(3, "Michael Johnson", "Finance", 70000.0);
        employeeList.add(employee3);

        Employee employee4 = new Employee(4, "Emily Davis", "Human Resources", 55000.0);
        employeeList.add(employee4);

        Employee employee5 = new Employee(5, "David Wilson", "IT", 80000.0);
        employeeList.add(employee5);

        Employee employee6 = new Employee(6, "Sarah Thompson", "Finance", 65000.0);
        employeeList.add(employee6);

        EmployeeProcessor EP = new EmployeeProcessor();

        //System.out.println(Arrays.toString(EP.getEmployeesInDepartment(employeeList,"Finance").toArray()));
        //EP.getEmployeesInDepartment(employeeList,"Finance").forEach(System.out::println);
        //EP.getEmployeesName(employeeList).forEach(System.out::println);
        //System.out.println(EP.getSalarySum(employeeList));
        EP.getIncrementedEmployeesSalary(employeeList,10).forEach(System.out::println);

    }
}