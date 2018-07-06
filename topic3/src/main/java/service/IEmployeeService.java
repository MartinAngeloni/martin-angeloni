package service;

import entity.Employee;

/**
 * Created by martin on 4/7/2018.
 */
public interface IEmployeeService {

    public void createEmployee(Employee employee);
    public Employee getEmployee(int index);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
}
