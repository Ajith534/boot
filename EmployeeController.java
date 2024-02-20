import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @GetMapping("/displayAll")
    public List<Employee> displayAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/display/{employeeId}")
    public Employee displayEmployee(@PathVariable String employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }
}
