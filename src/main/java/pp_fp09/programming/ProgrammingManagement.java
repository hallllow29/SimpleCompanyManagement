package pp_fp09.programming;

import pp_fp09.persons.Person;
import pp_fp09.persons.ProjectManager;

public class ProgrammingManagement {

    private static final int INIT_PERSONS = 10;
    private static final int EXPAND_FACTOR = 2;

    private int numberOfPersons = 0;
    private Person[] persons = new Person[INIT_PERSONS];
    
    private void expandCapacity() {
        Person[] tempPersons = new Person[persons.length * EXPAND_FACTOR];

        for (int i = 0; i < numberOfPersons; i++) {
            tempPersons[i] = persons[i];
        }

        persons = tempPersons;
    }
    
    private int findPerson(Person person) {
        for (int i = 0; i < numberOfPersons; i++) {
            if (persons[i].equals(person)) {
                return i;
            }
        }

        return -1;
    }
    
    public boolean addPerson(Person person) {
        if (findPerson(person) != -1) {
            return false;
        }
        
        if (numberOfPersons == persons.length) {
            expandCapacity();
        }

        persons[numberOfPersons++] = person;

        return true;
    }
    
    public void listPersons() {
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(persons[i]);
        }
    }

    public boolean removePerson(Person person) {
        int pos = findPerson(person) ;
        
        if (pos == -1) {
            return false;
        }

        for (int i = pos; i < numberOfPersons - 1; i++) {
            persons[i] = persons[i + 1];
        }

        persons[--numberOfPersons] = null;

        return true;

    }
    
    public void listProjectManagers() {
        for (int i = 0; i < numberOfPersons; i++) {
            if (persons[i] instanceof ProjectManager) {
                System.out.println(persons[i]);
            }
        }
    }

}
