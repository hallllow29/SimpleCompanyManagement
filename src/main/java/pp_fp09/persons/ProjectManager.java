package pp_fp09.persons;

import pp_fp09.projects.Project;
import java.time.LocalDate;
import java.time.YearMonth;


public class ProjectManager extends Person {
   
    private static int nextId = 0;
    
    private static final double INITIAL_SALARY = 1.15;
    private static final double INCREASE_SALARY_YEAR = 0.015;
    private static final double INCREASE_SALARY_PROJECTS = 0.01;
    private static final int MAX_PROJECTS = 5;
    private static final String MANAGER_CODE = "PM";

    private int numberOfProjects;
    private String code;
    private LocalDate contractDate;
    private Project[] projects = new Project[MAX_PROJECTS];

    public ProjectManager(int citizenCard, int vatNumber, int baseSalary, String name, String birthDate, String address, Project projects, LocalDate contractDate) {
        super(citizenCard, vatNumber, baseSalary, name, birthDate, address);

        this.nextId++;
        this.contractDate = contractDate;
        this.numberOfProjects = 0;
        this.addProjects(projects);
        this.setCode();
    }

    private void setCode() {
        this.code = MANAGER_CODE + this.nextId;
    }

    private boolean addProjects(Project newProject) {
        if (numberOfProjects == MAX_PROJECTS) {
            return false;
        }
        
        projects[numberOfProjects++] = newProject;
        
        return true;
    }

    @Override
    protected double getSalary() {
        double newSalary = getBaseSalary() * INITIAL_SALARY;
        int year = YearMonth.now().getYear() - this.contractDate.getYear();
        
        newSalary += (year  * INCREASE_SALARY_YEAR * newSalary);

        newSalary += (this.numberOfProjects * INCREASE_SALARY_PROJECTS * newSalary);

        return  newSalary;
    }

    private String printProjcets() {
        if (numberOfProjects == 0) {
            return "No projects involved at the moment";
        }
        
        String s = "\nInvolved projects: ";
        
        for (int i = 0; i < numberOfProjects; i++) {
            s += projects[i].toString();
        }
        
        return s;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCode: " + this.code + "\nContract date: " + this.contractDate + printProjcets();
    }

}
