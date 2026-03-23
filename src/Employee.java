import java.util.Objects;

public class Employee {
    private String firstname;
    private String lastname;
    private String surname;
    private String department;
    private int salary;
    private int id;
    private static int count = 0;

    public Employee(String firstname, String lastname, String surname, String department, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.id = ++count;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(salary);
    }

    @Override
    public String toString() {
        return "firstname = " + firstname  + ", lastname = " + lastname + ", surname = " + surname +
                ", department = " + department + ", salary = " + salary + ", id = " + id + ";";
    }

    public void printShortInfo() {
        System.out.println("firstname = " + firstname + ", salary = " + salary + ";");
    }
}
