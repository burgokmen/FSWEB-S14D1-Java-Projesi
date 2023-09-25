package brutech.employee;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.setSalary(30000);
        System.out.println(getName() + " starts to working as Junior Developer");
    }

    public void work(int salary) {
        super.setSalary(salary);
        System.out.println(getName() + " starts to working as Junior Developer");
    }
}
