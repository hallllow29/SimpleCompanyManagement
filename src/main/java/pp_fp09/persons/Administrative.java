package pp_fp09.persons;

import java.time.LocalDate;
import pp_fp09.enums.ContractType;
import pp_fp09.enums.EducationLevel;

public class Administrative extends Person {

    private static final double GRADUATION_SALARY = 1.10;
    private static final double MASTERS_SALARY = 1.20;
    private static final double DOCTORATE_SALARY = 1.30;
    private static final double PARTIAL_SALARY = 1.05;
    private static final double INTEGRAL_SALARY = 1.10;

    private String initials;
    private LocalDate beginContract;
    private LocalDate endContract;
    private ContractType contractType;
    private EducationLevel educationLevel;

    public Administrative(int citizenCard, int vatNumber, int baseSalary, String name, String birthDate, String address, String initials,LocalDate beginContract ,LocalDate endContract, ContractType contractType, EducationLevel educationLevel) {
        super(citizenCard, vatNumber, baseSalary, name, birthDate, address);

        this.initials = initials;
        this.beginContract = beginContract;
        this.endContract = endContract;
        this.contractType = contractType;
        this.educationLevel = educationLevel;
    }

    public Administrative(int citizenCard, int vatNumber, int baseSalary, String name, String birthDate, String address, String initials, LocalDate beginContract, ContractType contractType, EducationLevel educationLevel) {
        super(citizenCard, vatNumber, baseSalary, name, birthDate, address);

        this.initials = initials;
        this.beginContract = beginContract;
        this.endContract = null;
        this.contractType = contractType;
        this.educationLevel = educationLevel;
    }

    @Override
    protected double getSalary() {
        double baseSalary = getBaseSalary();

        if (this.contractType == this.contractType.INTEGRAL) {
            baseSalary *= INTEGRAL_SALARY;
        } else {
            baseSalary *= PARTIAL_SALARY;
        }

        if (this.educationLevel == this.educationLevel.GRADUATION) {
            return baseSalary * GRADUATION_SALARY;
        }
        if (this.educationLevel == this.educationLevel.MASTERS_DEGREE) {
            return baseSalary * MASTERS_SALARY;
        }

        return baseSalary * DOCTORATE_SALARY;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInitials: " + this.initials + "\nBegin Contract: " + this.beginContract + "\nEnd Contract: " + this.endContract + "\nContract type : "
                + ContractType.contractToString(contractType) + "\nEducation level: " + EducationLevel.educationToString(educationLevel);
    }
}
