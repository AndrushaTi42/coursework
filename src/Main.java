void main() {
    //инициализация объекта EmployeeBook;
    EmployeeBook employeeBook = new EmployeeBook();

    //вызываю метод добавления сотрудников 11 раз
    for (int i = 0; i < 11; i++) {
        Employee temp = new Employee("Firstname" + i, "Lastname" + i, "Middlename" + i, 1, 100000);
        boolean isAdded = employeeBook.addEmployee(temp);
        System.out.println("Employee added? " + isAdded);
    }
    printSep();

    //вывод списка сотрудников
    employeeBook.printAllEmployees();
    printSep();

    //смена отдела
    employeeBook.changeDept(7, 5);
    employeeBook.changeDept(8, 4);
    employeeBook.changeDept(9, 3);
    employeeBook.changeDept(10, 3);

    //индексация зп
    employeeBook.addIndexSalaryDepartment(1, 5);
    employeeBook.addIndexSalaryDepartment(2, 7);
    employeeBook.addIndexSalaryDepartment(3, 10);
    employeeBook.addIndexSalaryDepartment(4, 15);
    employeeBook.addIndexSalaryDepartment(5, 20);

    //средняя зп
    employeeBook.calculationAverageSalary();
    printSep();

    //налоги по двум системам
    employeeBook.calculationTax("PROGRESSIVE");
    employeeBook.calculationTax("PROPORTIONAL");
    printSep();

    //проверка не превышает ли з/п сотрудников отдела потолок;
    employeeBook.printOverlySalary(1, 105000);
    employeeBook.printOverlySalary(5, 115000);
    printSep();

    //проверка на получение минимальной з/п по количеству сотрудников;
    employeeBook.printDeficiencySalary(110000, 8);
    printSep();

//проверка на наличие сотрудника в системе, с точки зрения бух учета;
    Employee targEmp = employeeBook.getEmployees()[8];
    System.out.println(employeeBook.existsBySalary(targEmp));
    printSep();

//поиск сотрудника по id;
    employeeBook.findEmployeeForId(8);
}

public void printSep() {
    System.out.println("=======================");
}
