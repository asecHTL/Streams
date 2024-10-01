import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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

        System.out.println("Ausgabe von Liste (unsotiert) + \n");
        list.forEach(System.out::println);

        System.out.println("Ausgabe von Liste (sotiert) + \n");
        list.sort((o1, o2) -> Integer.compare(o2.getDamage(), o1.getDamage()));
        list.forEach(System.out::println);
    }

}