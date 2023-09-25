package brutech.employee;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(70000);
        System.out.println(getName() + " starts to working as Senior Developer");

    }
}
