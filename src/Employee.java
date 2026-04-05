import java.util.Objects;

public class Employee {
    private String firstname;
    private String lastname;
    private String midlname;
    private int department;
    private int salary;
    private int id;
    private static int count = 0;

    //конструктор
    public Employee(String firstname, String lastname, String middleName, int department, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.midlname = middleName;
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

    public String getMidlname() {
        return midlname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    //реализация сравнения equals по з/п;
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

    //переопределение toString;
    @Override
    public String toString() {
        return "firstname = " + firstname + ", lastname = " + lastname + ", surname = " + midlname +
                ", department = " + department + ", salary = " + salary + ", id = " + id + ";";
    }


    /**
     * метод вывода сотрудника: имя + з/п;
     */
    public void printShortInfo() {
        System.out.println("firstname = " + firstname + ", salary = " + salary + ";");
    }


    /**
     * увеличение з/п на percent
     * @param percent размер процента
     */
    public void indexSalary(double percent) {
        double increase = this.salary * (percent / 100);
        this.salary = (int) (this.salary + increase);
    }
}
