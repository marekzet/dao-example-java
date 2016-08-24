package mz.dao.core;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> all();
    Employee single(int id);

    void insert(Employee employee);
    void update(Employee employee) throws EntityNotFoundException;
    void delete(Employee employee);
}
