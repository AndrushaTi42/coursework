public class EmployeeBook {
    //массив класса Employee с данными сотрудников;
    private Employee[] employees = new Employee[10];

    public Employee[] getEmployees() {
        return employees;
    }

    //метод для заполнение массива;
    public boolean addEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    //метод удаления сотрудника из массива
    //по заданию не требуется, но будто логически напрашивается,
    // но если требуется следовать строго по ТЗ, то удалю;
    public void deleteEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i] == employee) {
                employees[i] = null;
                System.out.println("Employee with ID: " + employee.getId() + " - deleted;");
                return;
            }
        }
        System.out.println("Employees not found");
    }

    //вывод списка всех сотрудников;
    public void printAllEmployees() {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp.toString());
            }
        }
    }

    //подсчет средней з/п;
    public void calculationAverageSalary() {
        double sum = 0;
        int count = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                sum += emp.getSalary();
                count++;
            }
        }
        if (count != 0) {
            double average = sum / count;
            System.out.println("Average salary = " + average);
        } else {
            System.out.println("Employees not found");
        }
    }

    //подсчет и вывод налогов в PROGRESSIVE и PROPORTIONAL системах;
    public void calculationTax(String taxSystem) {
        switch (taxSystem) {
            case "PROGRESSIVE":
                double taxProg = 0;
                for (Employee emp : employees) {
                    if (emp == null) {
                        continue;
                    } else if (emp.getSalary() > 0 && emp.getSalary() < 150000) {
                        taxProg += (emp.getSalary() * 0.13);
                    } else if (emp.getSalary() >= 150000 && emp.getSalary() < 350000) {
                        taxProg += (emp.getSalary() * 0.17);
                    } else if (emp.getSalary() >= 350000) {
                        taxProg += (emp.getSalary() * 0.21);
                    }
                }
                System.out.println("Tax PROGRESSIVE = " + taxProg);
                break;
            case "PROPORTIONAL":
                double taxProp = 0;
                for (Employee emp : employees) {
                    if (emp != null) {
                        taxProp += (emp.getSalary() * 0.13);
                    }
                }
                System.out.println("Tax PROPORTIONAL = " + taxProp);
                break;
            default:
                System.out.println("tax system not selected");
        }
    }

    //индексация зп по отделам;
    public void addIndexSalaryDepartment(int targetDept, double percent) {
        for (Employee emp : employees) {
            if (emp == null) {
                continue;
            } else if (emp.getDepartment() != targetDept) {
                continue;
            } else {
                emp.indexSalary(percent);
            }
        }
    }

    //проверка не превышает ли з/п сотрудников отдела потолок;
    public void printOverlySalary(int targetDept, int minSalary) {
        boolean found = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == targetDept
                    && employees[i].getSalary() > minSalary) {
                System.out.println("Employees № " + (i + 1));
                employees[i].printShortInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employees not found");
        }
    }

    //проверка на получение минимальной з/п по количеству сотрудников;
    public void printDeficiencySalary(int wage, int employeeNumber) {
        int i = 0;
        int count = 0;
        while (i < employees.length) {
            if (employees[i] != null && employees[i].getSalary() < wage) {
                employees[i].printShortInfo();
                count++;
                if (count == employeeNumber) {
                    break;
                }
            }
            i++;
        }
    }

    //проверка на наличие сотрудника в системе, с точки зрения бух учета;
    public boolean existsBySalary(Employee target) {
        for (Employee emp : employees) {
            if (emp != null && emp.equals(target)) {
                return true;
            }
        }
        return false;
    }

    //поиск сотрудника по id;
    public void findEmployeeForId(int id) {
        for (Employee emp : employees) {
            if (emp != null && emp.getId() == id) {
                emp.printShortInfo();
                return;
            }
        }
        System.out.println("Employees not found");
    }

    //изменения отдела. По тз нет, но добавил для простоты смены отдела сотрудника,
    // чтоб облегчить проверку других методов
    public void changeDept(int id, int newDept) {
        for (Employee emp : employees) {
            if (emp != null && emp.getId() == id) {
                emp.setDepartment(newDept);
                return;
            }
        }
        System.out.println("Employees not found");
    }
}
