package pp_fp09.persons;

import pp_fp09.enums.ProgrammerType;

public class JavaProgrammer extends Person {

    private static int nextId = 0;
    
    private static final double JUNIOR_SALARY = 1.05;
    private static final double SENIOR_SALARY = 1.15;
    private static final double INITIAL_SALARY = 1.05;
    private static final double SALARY_INCREASE = 0.5;
    private static final String JUNIOR_CODE = "J";
    private static final String SENIOR_CODE = "S";

    private int programmingYears;
    private final String code;
    private String projectName;
    private ProgrammerType programmerType;

    public JavaProgrammer(int citizenCard, int vatNumber, int baseSalary, String name, String birthDate, String address, int programmingYears, String projectName, ProgrammerType programmerType) {
        super(citizenCard, vatNumber, baseSalary, name, birthDate, address);

        this.programmingYears = programmingYears;
        this.projectName = projectName;
        this.programmerType = programmerType;
        this.code = (this.programmerType == this.programmerType.JUNIOR) ? JUNIOR_CODE : SENIOR_CODE + (this.nextId++);
    }

    @Override
    protected double getSalary() {
        double newBaseSalary = getBaseSalary() * INITIAL_SALARY;

        if (this.programmerType == this.programmerType.JUNIOR) {
            return (newBaseSalary * JUNIOR_SALARY) + (SALARY_INCREASE * programmingYears);

        }

        return newBaseSalary * SENIOR_SALARY + SALARY_INCREASE * programmingYears;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCode: " + this.code + "\nProject Name: " + this.projectName + "\nProgrammer type: " + ProgrammerType.typeToString(programmerType);
    }

}
