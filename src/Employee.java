import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private LocalDate birthDate;
    private List<Computers> pc = new ArrayList<>();

    public Employee(String name, LocalDate birthDate, List computers) {
        this.name = name;
        this.birthDate = birthDate;
        this.pc = computers;
    }
    public Employee(String karl, LocalDate of) {
    } // Proc tento konstruktor a je zapotreb?, na hore mam uz jeden

    public void addPcMethod(Computers companyPc) {
        pc.add(companyPc);
    }

    public void removePcMethod(Computers companyPc) {
        pc.remove(companyPc);
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

    public List<Computers> getPc() {
        return pc;
    } // Bezpecnost

    public void setPc(List<Computers> pc) {
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

