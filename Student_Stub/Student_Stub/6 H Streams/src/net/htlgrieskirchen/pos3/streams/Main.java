package net.htlgrieskirchen.pos3.streams;

import Hauptbesipiel1.CombatType;
import Hauptbesipiel1.DamageType;
import Hauptbesipiel1.Weapon;

import java.io.File;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
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
    }
}
