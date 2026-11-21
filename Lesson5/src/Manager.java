
public class Manager extends Employee {

    private int teamSize;

    public Manager(
        int employeeId,
        String name,
        double salary,
        int teamSize
    ) {

        super(employeeId, name, salary);

        this.teamSize = teamSize;
    }

    public void manageTeam() {

        System.out.println(
            name + " is managing " + teamSize + " employees"
        );
    }
}
