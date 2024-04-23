package pp_fp09.persons;

public abstract class Person {

    private int citizenCard;
    private int vatNumber;
    private int baseSalary;
    private String name;
    private String birthDate;
    private String address;

    public Person(int citizenCard, int vatNumber, int baseSalary, String name, String birthDate, String address) {
        this.citizenCard = citizenCard;
        this.vatNumber = vatNumber;
        this.baseSalary = baseSalary;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
    }

    protected abstract double getSalary();
    
    protected int getBaseSalary() {
        return this.baseSalary;
    }
    
    @Override
    public String toString() {
        return "\nName: " + this.name + "\nCitizen Card: " + this.citizenCard + "\nVat Number: " + this.vatNumber + "\nBirth date: " + this.birthDate + "\nAddress : " + this.address + 
                "\nSalary: " + getSalary() + "€";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }  
        if (obj == null ) {
            return false;
        }  
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Person other = (Person) obj;
        return this.citizenCard == other.citizenCard && this.vatNumber == other.vatNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.citizenCard;
        return hash;
    }

}
