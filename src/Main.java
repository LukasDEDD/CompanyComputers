import java.math.BigDecimal;
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

        }
    }
