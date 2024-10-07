package Hauptbesipiel1;

import java.io.IOException;
import java.util.List;

import static java.util.Comparator.comparing;

public class Main {


    public static void main(String[] args) throws IOException {

        //BSP 1:
//        List<Weapon>list = new LinkedList<>();
//
//        list.clear();
//        list = Files.lines(new File("weapons.csv").toPath())
//                .skip(1)
//                .map(s -> s.split(";"))
//                .map(s -> new Weapon(
//                    s[0],
//                    CombatType.valueOf(s[1]),
//                    DamageType.valueOf(s[2]),
//                    Integer.parseInt(s[3]),
//                    Integer.parseInt(s[4]),
//                    Integer.parseInt(s[5]),
//                    Integer.parseInt(s[6])
//                ))
//                .collect(Collectors.toList());


        //BSP 2:
        System.out.println("Task 2  \n");
        System.out.println("Ausgabe von Liste (sotiert)  \n");
        List<Weapon>listTask2 = list;
        listTask2.sort((o1, o2) -> Integer.compare(o2.getDamage(), o1.getDamage()));
        listTask2.forEach(System.out::println);





        //BSP 4:
        System.out.println("Task 4");


        //Bsp 5:


    }
    public void sortList(List<Weapon>list){
        //BSP 3:
        System.out.println("Task 3");
        System.out.println("Ausgabe von Liste (sotiert)  \n");

        list.sort(comparing((o1, o2) -> o1.getCombatType().compareTo(o2.getCombatType)));
                .comparing((o1,o2) -> o1.getDamageType().compareTo(o2.getDamageType)));
                .comparing((o1,o2) -> o1.getName().compareTo()o2.getName));


        list.forEach(System.out::println);
    }



}