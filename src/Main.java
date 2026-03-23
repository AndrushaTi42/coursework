void main() {
    Employee grisha = new Employee("Grigory", "Efremov", "Olegovich",
            "driver", 75000);
    Employee andrew = new Employee("Andrew", "Bobrow", "Alexandrovich",
            "it", 140000);
    System.out.println(grisha);
    System.out.println(andrew);
    System.out.println(grisha.equals(andrew));
    grisha.printShortInfo();
    andrew.printShortInfo();
    
}
