import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {

        Computers direktor =
                new Computers("Dell", 250.5, false, new BigDecimal("475.80"), true);

        Computers managerComputer =
                new Computers(250, true);

        List<Computers> companyPc = new ArrayList<>();
        companyPc.add(direktor);
        companyPc.add(managerComputer);

        System.out.println(companyPc.get(0));
        System.out.println("The number of laptops in the list is:" + companyPc.size());

        Employee manager =
                new Employee("Karl", LocalDate.of(1995, 5, 31));

        manager.addPcMethod(managerComputer); // zde se do objektu manager z Employee
        // pridava managerComputers z Computers, pomoci .addPcMethod//
        manager.addPcMethod(
                new Computers(250, true) // vytvoř nový objekt typu Computers/

        );
    }
}