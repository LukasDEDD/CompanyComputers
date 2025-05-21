import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private LocalDate birthDate;
    private List<Computer> pc = new ArrayList<>(); // seznam pocitacu, kde ma kazdy
    // zamestnanec svuj pocitac

    public Employee(String name, LocalDate birthDate, List<Computer> computers) {
        this.name = name;
        this.birthDate = birthDate;
        this.pc = computers;
    }
    public Employee(String karl, LocalDate of) {
    } // Proc tento konstruktor a je zapotreb?, na hore mam uz jeden

    public void addPcMethod(Computer companyPc) {
        pc.add(companyPc); // do seznamu pc pridej promenou companyPc typu Computer-tridy
        // zde se spojujou 2 tridy
    }

    public void removePcMethod(Computer companyPc) {
        pc.remove(companyPc); //????
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Computer> getPc() {
        return pc;
    } // Bezpecnost

    public void setPc(List<Computer> pc) {
        this.pc = pc;


    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", pc=" + pc +
                '}';
    }
}

