package mz.dao.client;

import mz.dao.core.Employee;
import mz.dao.core.EmployeeDAO;
import mz.dao.core.EmployeeDAOImpl;

/**
 * http://stackoverflow.com/questions/8550124/what-is-the-difference-between-dao-and-repository-patterns
 * http://stackoverflow.com/questions/19154202/data-access-object-dao-in-java
 */
public class Main {

    private static EmployeeDAO dao = new EmployeeDAOImpl();

    public static void main(String[] args) {
        displayEmployeeInfo();
    }

    private static void displayEmployeeInfo() {
        int searchedEmployeeId = 1;


        Employee employee = dao.single(searchedEmployeeId);

        System.out.printf("Employee Id: %d \n", searchedEmployeeId);
        System.out.println("Name: " + employee.getName());
    }

    private static void insertEmployee() {
        Employee employee = new Employee("Dirty Harry");
        dao.insert(employee);
    }

    private static void updateEmployeeInfo() {
    }

    private static void deleteEmployee() {
    }
}