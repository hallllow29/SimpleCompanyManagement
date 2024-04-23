package pp_fp09.projects;

public class Project {

    private  static int nextId = 0;
    private int budget;
    private String projectName;
    private String beginDate;
    private String expectedEndDate;

    public Project(int budget, String projectName, String beginDate, String expectedEndDate) {
        this.nextId++;
        this.budget = budget;
        this.projectName = projectName;
        this.expectedEndDate = expectedEndDate;
        this.beginDate = beginDate;
    }

    @Override
    public String toString() {
        return "\nProject name: " + this.projectName + "\nBudget: " + this.budget + "€" + "\nBegin date: " + this.beginDate + "\nExpectation end date: " + this.expectedEndDate;
    }
}
