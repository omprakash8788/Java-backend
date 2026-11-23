
public class Manager extends Employee {

    private int teamSize;

    public Manager(
        int employeeId,
        String name,
        double salary,
        int teamSize
    ) {

        super(employeeId, name, salary);

        if (teamSize <= 0) {
            throw new IllegalArgumentException(
                "Team size must be positive"
            );
        }

        this.teamSize = teamSize;
    }

    @Override
    public void work() {

        System.out.println(
            getName() + " is managing "
            + teamSize + " employees"
        );
    }
}
