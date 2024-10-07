package net.htlgrieskirchen.pos3.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public double average(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
    
    public List<String> upperCase(String[] strings) {
        return Arrays.stream(strings).toList().stream().map(String::toUpperCase).collect(Collectors.toList());
    }
    
    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {
        return weapons.stream().min((s,x) -> s.getDamage() - x.getDamage()).orElse(null);
    }
    
    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        return weapons.stream().max((s,x) -> s.getDamage() - x.getDamage()).orElse(null);
    }
    
    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        return weapons.stream().filter(x -> x.getDamageType().equals(DamageType.MISSILE)).toList();
    }
    
    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        return weapons.stream().max((s,x) -> s.getName().compareTo(x.getName())).orElse(null);
    }
    
    public List<String> toNameList(List<Weapon> weapons) {
        return weapons.stream().map(Weapon::getName).collect(Collectors.toList());
    }

    public int[] toSpeedArray(List<Weapon> weapons) {
        return weapons.stream().map(Weapon::getSpeed).mapToInt(Integer::intValue).toArray();
    }

    public int sumUpValues(List<Weapon> weapons) {
        return weapons.stream().map(Weapon::getValue).reduce(0, Integer::sum);
    }

    public long sumUpHashCodes(List<Weapon> weapons) {
        return weapons.stream().map(Weapon::hashCode).reduce(0, Integer::sum);
    }

    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        return weapons.stream().distinct().collect(Collectors.toList());
    }

    public void increaseValuesByTenPercent(List<Weapon> weapons) {
        weapons.forEach(weapon -> weapon.setValue((int) (weapon.getValue() * 1.1)));
    }
}
