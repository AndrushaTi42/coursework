void main() {
    Employee employee1 = new Employee("Grigory", "Efremov", "Olegovich",
            1, 75000);
    Employee employee2 = new Employee("Andrew", "Bobrow", "Alexandrovich",
            1, 100000);
    Employee employee3 = new Employee("Egor", "Ladigin", "Olegovich",
            1, 90000);
    Employee employee4 = new Employee("Andrew", "Kozlov", "Ivanovich",
            2, 140000);
    Employee employee5 = new Employee("Ivan", "Malikov", "Andreevich",
            2, 160000);
    Employee employee6 = new Employee("Ivan", "Ivanov", "Alexandrovich",
            3, 240000);
    Employee employee7 = new Employee("Evgeni", "Jumaev", "Maximovich",
            4, 275000);
    Employee employee8 = new Employee("Petr", "Kovda", "Alexandrovich",
            5, 410000);
    System.out.println(employee1);
    System.out.println(employee2);
    System.out.println(employee1.equals(employee2));
    employee1.printShortInfo();
    employee2.printShortInfo();
    EmployeeBook employeeBook = new EmployeeBook();
    employeeBook.addEmployee(employee1);
    employeeBook.addEmployee(employee2);
    employeeBook.addEmployee(employee3);
    employeeBook.addEmployee(employee4);
    employeeBook.addEmployee(employee5);
    employeeBook.addEmployee(employee6);
    employeeBook.addEmployee(employee7);
    employeeBook.addEmployee(employee8);
    employeeBook.calculationAverageSalary();
    employeeBook.printAllEmployees();
    employeeBook.addIndexSalaryDepartment(5,10);
    employeeBook.printOverlySalary(5,100000);
    employeeBook.printDeficiencySalary(200000, 3);
    System.out.println(employeeBook.existsBySalary(employee8));
    employeeBook.calculationTax("PROGRESSIVE");
    employeeBook.deleteEmployee(employee5);
    employeeBook.findEmployeeForId(3);
}
