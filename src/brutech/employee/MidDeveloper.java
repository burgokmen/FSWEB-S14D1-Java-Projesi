package brutech.employee;

public class MidDeveloper extends Employee{

    public MidDeveloper(int id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        setSalary(50000);
        System.out.println(getName() + " starts to working as Mid Developer");

    }
}
