import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void assignTaskToAll(int task) {
        for (Employee employee : employees) {
            employee.assignTask(task);
        }
    }
}
