package pp_fp09.programming;

import pp_fp09.persons.Person;
import pp_fp09.persons.Administrative;
import pp_fp09.persons.JavaProgrammer;
import pp_fp09.persons.ProjectManager;
import pp_fp09.enums.ContractType;
import pp_fp09.enums.EducationLevel;
import pp_fp09.enums.ProgrammerType;
import pp_fp09.projects.Project;
import java.time.LocalDate;

public class ProgrammerDemo {

    public static void main(String[] args) {
        Administrative pedro = new Administrative(15363550, 249242613, 1000, "Pedro Antunes", "1997-03-06", "Rua Castelo de Pombal", "PA", LocalDate.of(2020, 03, 06), LocalDate.of(2024, 03, 07), ContractType.PARTIAL, EducationLevel.DOCTORATE);
        JavaProgrammer ruben = new JavaProgrammer(1231231, 222222, 1000, "Ruben", "1999-09-10", "Rua do ruben", 5 , "Projeto PP", ProgrammerType.SENIOR);
        
        Project projeto = new Project(5000, "Projeto piloto", "2023-02-30", "2024-06-03");
        
        ProjectManager joao = new ProjectManager(111111, 223232, 1000, "Joao", "1996-03-10", "Rua do joao", projeto, LocalDate.of(2020, 10, 03));
        
        ProgrammingManagement google = new ProgrammingManagement();
        
        google.addPerson(pedro);
        google.addPerson(ruben);
        google.addPerson(joao);
        google.addPerson(pedro);
        
        google.listPersons();
        
        google.listProjectManagers();
        
    }

}
