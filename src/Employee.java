import java.lang.annotation.ElementType;
import java.util.List;

public class Employee extends Human{
    private String jobTitle;
    private double salary;
    private String department;
    private String employeeID;

    public Employee(String name, int age, String securityNumber, String address, String phoneNumber, String jobTitle, double salary, String department, String employeeID) {
        super(name, age, securityNumber, address, phoneNumber);
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.department = department;
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public static boolean login(String securityNumber, String employeeID, List<Employee> employees){

        for (Employee employee : employees) {
            if (employee.getSecurityNumber().equals(securityNumber) && employee.getEmployeeID().equals(employeeID)) {
                return true;
            }
        }
        return false;
    }

}
