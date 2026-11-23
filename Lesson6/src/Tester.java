
public class Tester extends Employee {

    private String testingTool;

    public Tester(
        int employeeId,
        String name,
        double salary,
        String testingTool
    ) {

        super(employeeId, name, salary);

        if (testingTool == null || testingTool.isBlank()) {
            throw new IllegalArgumentException(
                "Testing tool cannot be empty"
            );
        }

        this.testingTool = testingTool;
    }

    @Override
    public void work() {

        System.out.println(
            getName() + " is testing software using "
            + testingTool
        );
    }
}
