package com.wilsonkomlan.hrservicems.resources;

import java.util.Arrays;
import java.util.List;

import com.wilsonkomlan.hrservicems.models.Employee;
import com.wilsonkomlan.hrservicems.models.EmployeesList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hr")
public class HrResources {

    static List<Employee> fackEmployees = Arrays.asList(new Employee("E1", "Afouno", "ALOUKA", "Cardiologue"),
            new Employee("E2", "Smith", "DJONHSON", "Pediatre"), new Employee("E3", "Afouno", "KOMI", "Labortin"));

    @GetMapping("/employees")
    public EmployeesList getEmployees() {
        EmployeesList emp = new EmployeesList();
        emp.setEmployees(fackEmployees);
        return emp;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable("id") String id) {
        return fackEmployees.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
    }

}
