public Employee findMinSalaryEmployee() {
    Employee minEmployee = null;
    double minSalary = Double.MAX_VALUE;
    for (Employee e : employees) {
        if (e != null) {
            if (e.getSalary() < minSalary) {
                minSalary = e.getSalary();
                minEmployee = e;
            }
        }
    }
    return minEmployee;
}