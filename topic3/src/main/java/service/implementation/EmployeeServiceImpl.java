package service.implementation;

import entity.Employee;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;
import service.IEmployeeService;

/**
 * Created by martin on 4/7/2018.
 */
@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements IEmployeeService {

    //create
    @Override
    public void createEmployee(Employee employee) {
        EmployeeRepository.employeList.add(employee);
    }

    //read
    @Override
    public Employee getEmployee(int index) {
        return (Employee) EmployeeRepository.employeList.get(index);
    }

    //update
    @Override
    public void updateEmployee(Employee employee) {
        EmployeeRepository.employeList.remove(employee);
        EmployeeRepository.employeList.add(employee);
    }

    //delete
    @Override
    public void deleteEmployee(Employee employee) {
        EmployeeRepository.employeList.remove(employee);
    }
}
