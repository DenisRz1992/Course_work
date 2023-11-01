import java.util.Objects;

public class Employee {
    private static int counter = 0;
    private final String name;
    private int id;
    private int salary;
    private int department;

    public Employee ( String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = validateDepartment(department);
        this.id = counter++;
    }

    public int getId() {return id;}
    public String getName () {return this.name;}
    public int getSalary () {return this.salary;}
    public static int getCounter () {return counter;}
    public void setSalary (int salary) {this.salary = salary;}
    public int getDepartment () {return this.department; }
    public void setDepartment (int department) {this.department = department;}


    @Override
    public  String toString () {
        return "id: " + id + "; Сотрудник: " + name + "; Зарплата: " + salary + "; Отдел: " + department + ";";
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return  id == employee.id && salary == employee.salary && department == employee.department && Objects.equals(name, employee.name);
    }

    @Override
    public  int hashCode () { return Objects.hash( name, id, salary, department);}

    private int validateDepartment( int department) { return department < 1 || department > 5 ? 1: department;}
}
