import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Computers direktor =
                new Computers ("Dell",250.5, false, new BigDecimal("475.80"),true );

        Computers manager =
                new Computers (250, true);

    List <Computers> notebooks = new ArrayList<>();
        notebooks.add(direktor);
        notebooks.add(manager);

        System.out.println(notebooks.get(0));
        System.out.println("The number of laptops in the list is:" + notebooks.size());


    Employee John =
            new Employee("John", LocalDate.of(1975, 10, 10));
    Employee Paul =
            new Employee("Fred", LocalDate.of(1980,3,12));

    List <Employee> managment = new ArrayList<>();
        managment.add(John);
        managment.add(Paul);

    }
}
