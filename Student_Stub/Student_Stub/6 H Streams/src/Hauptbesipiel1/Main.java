package Hauptbesipiel1;

import net.htlgrieskirchen.pos3.streams.Streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Main {


    public static void main(String[] args) throws IOException {

        List<Weapon>list = new LinkedList<>();

        list.clear();
        try{
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

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Task 2");
        Streams streams = new Streams();
        Random rand = new Random();
        int[] array = new int[10000];
        String[] strings = {"POS", "WMC", "DBI", "1", "0", "13", "100", "56", "Essen", "BSPK"};

        for (int i = 0; i < 10000; i++) {
            array[i] = rand.nextInt(100);
        }
        double average = streams.average(array);
        System.out.println(average);

        List<String> stringList = streams.upperCase(strings);
        stringList.forEach(System.out::println);




        //BSP 2:
        System.out.println("Task 2  \n");
        System.out.println("Ausgabe von Liste (sotiert)  \n");
        List<Weapon>listTask2 = list;
        listTask2.sort((o1, o2) -> Integer.compare(o2.getDamage(), o1.getDamage()));
        listTask2.forEach(System.out::println);


        //BSP 3:
        System.out.println("Task 3  \n");
        sortList(list);

        //BSP 4:
        System.out.println("Task 4 \n");


        //Bsp 5:


    }
    public static void sortList(List<Weapon>list){
        //BSP 3:
        list.sort(Comparator
                .comparing(Weapon::getCombatType)
                .thenComparing(Weapon::getDamageType)
                .thenComparing(Weapon::getName)
        );
        list.forEach(System.out::println);
    }



}