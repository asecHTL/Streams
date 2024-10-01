import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws IOException {
        List<Weapon>list = new LinkedList<>();

        list.clear();
        list = Files.lines(new File("weapons.csv").toPath())
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Weapon(
                    s[0],
                    CombatType.valueOf(s[1]),
                    DamageType.valueOf(s[2]),
                    Integer.parseInt(s[3]),
                    Integer.parseInt(s[4]),
                    Integer.parseInt(s[5]),
                    Integer.parseInt(s[6])
                ))
                .collect(Collectors.toList());



        System.out.println("Task 2  \n");
        System.out.println("Ausgabe von Liste (sotiert)  \n");
        List<Weapon>listTask2 = list;
        listTask2.sort((o1, o2) -> Integer.compare(o2.getDamage(), o1.getDamage()));
        listTask2.forEach(System.out::println);

        System.out.println("Task 3");
        System.out.println("Ausgabe von Liste (sotiert)  \n");
        List<Weapon>listTask3 = list;
        listTask3.sort((o1, o2) -> o1.getCombatType().compareTo(o2.getCombatType()));
        listTask3.sort((o1, o2) -> o1.getDamageType().compareTo(o2.getDamageType()));
        listTask3.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        listTask3.sort(Comparator
                .comparing((o1, o2) -> o1.getCombatType().compareTo(o2.getCombatType()));
                //.comparing((o1, o2) -> o1.getCombatType().compareTo(o2.getCombatType())));

        listTask3.forEach(System.out::println);

        System.out.println("Task 4");


    }

}