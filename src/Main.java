public void printAllEmployees() {
    for (Employee e : employees) {
        if (e != null) {
            System.out.println("ID: " + e.getId()
                    + ", ФИО: " + e.getFullName()
                    + ", Зарплата: " + e.getSalary());
        }
    }
}