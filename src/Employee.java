import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private LocalDate birthDate;
    private List <Computers> pc = new ArrayList<>();

    public Employee(String name, LocalDate birthDate, List computers) {
        this.name = name;
        this.birthDate = birthDate;
        this.pc = computers;
    }
    public void addPc(Computers companyPc) {
        pc.add(companyPc);
    }

    public void removePc(Computers companyPc) {
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

    public List getPc() {
        return pc;
    }

    public void setPc(List pc) {
        this.pc = pc;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", computers=" + pc +
                '}';
    }
}
