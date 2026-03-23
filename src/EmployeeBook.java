public class EmployeeBook {
    private Employee[] employees = new Employee[10]; //массив класса Employee с данными сотрудников;
    private int employeesCell = 0; //доп переменная с информацией о количестве сотрудников;

    public void addEmployee(Employee newEmployee) { //метод для заполнение массива;
        if (employeesCell < employees.length) {
            employees[employeesCell] = newEmployee;
            employeesCell++;
        } else {
            System.out.println("the storage is full!");
        }
    }
}
