package repository;

import entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 4/7/2018.
 */
public class EmployeeRepository {

    public static final List employeList = new ArrayList<Employee>();

}
