import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {

        Computer direktor =
                new Computer("Dell", 250.5, false, new BigDecimal("475.80"), true);

        Computer managerComputer =
                new Computer(250, true);

        List<Computer>pcList= new ArrayList<>();
        pcList.add(direktor);
        pcList.add(managerComputer);

        System.out.println(pcList.get(0));
        System.out.println("The number of laptops in the list is:" + pcList.size());

        Employee manager =
                new Employee("Karl", LocalDate.of(1995, 5, 31));

        manager.addPcMethod(managerComputer); // zde se do objektu manager, z Employee
        // pridava managerComputers z Computers, pomoci .addPcMethod//
        manager.addPcMethod(
                new Computer(250, true) // vytvoř nový objekt typu Computers/

        );
    }
}