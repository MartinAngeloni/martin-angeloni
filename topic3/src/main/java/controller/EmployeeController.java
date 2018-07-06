package controller;

import entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.IEmployeeService;

/**
 * Created by martin on 4/7/2018.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Qualifier("employeeServiceImpl")
    private IEmployeeService iEmployeeService;

    //create
    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        iEmployeeService.createEmployee(employee);
        return ResponseEntity.ok().build();
    }

    //read
    @GetMapping("/get/{index}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int index){
        Employee employee = (Employee) iEmployeeService.getEmployee(index);
        return ResponseEntity.ok(employee);
    }

    //update
    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        iEmployeeService.updateEmployee(employee);
        return ResponseEntity.ok().build();
    }

    //delete
    @DeleteMapping("/delete")
    public ResponseEntity<Employee> deleteEmployee(@RequestBody Employee employee){
        iEmployeeService.deleteEmployee(employee);
        return ResponseEntity.ok().build();
    }
}
