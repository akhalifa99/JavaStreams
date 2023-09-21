import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class EmployeeProcessor {

    public List<Employee> getEmployeesInDepartment(List<Employee> employees,String department){
        return employees.stream().
                filter(employee -> employee.department.equals(department)).collect(Collectors.toList());
    }
    public List<String> getEmployeesName(List<Employee> employees){
        return employees.stream().map(employee -> employee.name).collect(Collectors.toList());
    }
    public double getSalarySum(List<Employee> employees){
       return
        employees.stream().mapToDouble(employee-> employee.salary).sum();
    }
    public List<Employee> getIncrementedEmployeesSalary(List<Employee> employees,double incSalary){
         employees.stream()
                .forEach(employee ->
                        employee.setSalary(employee.getSalary() + ((employee.getSalary()) * incSalary)/100));
         return employees;
    }

}
