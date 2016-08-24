package mz.dao.core;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public List<Employee> all() {
        return data();
    }

    @Override
    public Employee single(int id) {
        return data().stream().filter(e -> e.getId() == id).findFirst().get();
    }

    @Override
    public void insert(Employee employee) {
        data().add(employee);
    }

    @Override
    public void update(Employee employee) throws EntityNotFoundException {
        Employee emp = single(employee.getId());
        if(emp == null)
            throw new EntityNotFoundException("Cannot find employee for given criteria");

        emp.setName(employee.getName());
    }

    @Override
    public void delete(Employee employee) {
        data().remove(employee);
    }

    private List<Employee> data() {
        List<Employee> data = new ArrayList<>();
        data.add(new Employee(1, "James Bond"));
        data.add(new Employee(2, "Frank Underwood"));
        data.add(new Employee(3, "Fox Mulder"));

        return data;
    }

    private int nextId() {
        return data().get(data().size() - 1).getId();
    }
}