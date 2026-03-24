import java.util.Objects;

public class Employee {
    private String firstname;
    private String lastname;
    private String surname;
    private int department;
    private int salary;
    private int id;
    private static int count = 0;

    public Employee(String firstname, String lastname, String surname, int department, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.id = ++count;

    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
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

    public void indexSalary(double percent) {      //увеличение з/п на процент;
        double increase = this.salary * (percent / 100);
        this.salary = (int) (this.salary + increase);
    }
}
