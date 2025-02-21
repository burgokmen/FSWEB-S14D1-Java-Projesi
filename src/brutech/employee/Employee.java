package brutech.employee;

public class Employee {
    private int id;
    private String name;
    private int salary;



    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public Employee(int id, String name, int salary) {
        this(id,name);
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " starts to working" );
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
