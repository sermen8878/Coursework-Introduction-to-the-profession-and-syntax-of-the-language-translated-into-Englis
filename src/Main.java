public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int capacity) {
        employees = new Employee[capacity];
    }

    // Добавлены проверки на уникальность ID
    public boolean addEmployee(Employee employee) {
        if (employee == null || getEmployee(employee.getId()) != null) return false;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    // Удаление с проверкой существования сотрудника
    public boolean removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }

    // Получение сотрудника с обработкой null
    public Employee getEmployee(int id) {
        for (Employee e : employees) {
            if (e != null && e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}