import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Computers direktor =
                new Computers ("Dell",250.5, false, new BigDecimal("475.80"),true );

        Computers managerComputer =
                new Computers (250, true);

    List <Computers> notebooks = new ArrayList<>();
        notebooks.add(direktor);
        notebooks.add(managerComputer);

        System.out.println(notebooks.get(0));
        System.out.println("The number of laptops in the list is:" + notebooks.size());

        Employee manager =
                new Employee("Karl", LocalDate.of(1995, 5, 31));

        manager.addPcMethod(managerComputer);
        manager.addPcMethod(
                new Computers (250,
                        true) /* Vytvoř nový objekt typu Computers s parametry 250 a true,
                        a ten předej jako argument metodě addPcMethod objektu manager*/

        );
    }
}
