public class Main {


    private static Employee[] employees = new Employee[10];

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee resultEmployee = employees[0];
        int minSalary = resultEmployee.getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                resultEmployee = employee;
            }
        }
        return resultEmployee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        return calculateTotalSalary() / Employee.getCounter();
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Сидоренко Михаил Викторович", 70000, 1 );
        employees = new Employee[] {
                new Employee("Сидоренко Михаил Викторович", 70000, 1),
                new Employee("Кортункова Ольга Владимировна", 90000, 2),
                new Employee("Иваненко Георгий Максимович", 53000, 4),
                new Employee("Большакова Наталья Петровна", 89000, 3),
                new Employee("Эдвард Билл", 1_000_000, 5),
                new Employee("Кира Найтли", 300_000, 6),
                new Employee("Жуков Андрей Вячеславович", 210000, 7),
                new Employee("Брэд Питт", 101000, 8),
                new Employee("Моника Белучи", 190000, 1),
                new Employee("Захаров Семен Семенович", 40000, 5)
        };
        printEmployees();
        System.out.println("avg = " + calculateAverageSalary());
    }
}