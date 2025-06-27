package InheritanceChallenge;

public class Employee extends Worker {

    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;

    public Employee(String name, String birthDate, long employeeid, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++; // Increment employeeNo for each new Employee
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + super.toString() + '\'' +
                '}';
    }
}
