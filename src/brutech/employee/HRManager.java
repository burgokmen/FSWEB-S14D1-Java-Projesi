package brutech.employee;

import java.util.Arrays;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, JuniorDeveloper[] juniorDevs, MidDeveloper[] midDevs, SeniorDeveloper[] seniorDevs) {
        super(id, name);
        juniorDevelopers = juniorDevs;
        this.midDevelopers = midDevs;
        this.seniorDevelopers = seniorDevs;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper){
        try{
            if(juniorDevelopers[index] == null){
                juniorDevelopers[index] = juniorDeveloper;
            }else{
                System.out.println("Full Index");
            }

        }catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("No Index: " + exception.getMessage());

        }

    }

    public void addEmployee(int index, MidDeveloper midDeveloper){
        try{
            if(midDevelopers[index] == null){
                midDevelopers[index] = midDeveloper;
            }else{
                System.out.println("Full Index");
            }

        }catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("No Index: " + exception.getMessage());

        }

    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper){
        try{
            if(seniorDevelopers[index] == null){
                seniorDevelopers[index] = seniorDeveloper;
            }else{
                System.out.println("Full Index");
            }

        }catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("No Index: " + exception.getMessage());

        }

    }




    public void work() {
        setSalary(70000);
        System.out.println(getName() + " starts to working as HR Manager " + getSalary());


    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
