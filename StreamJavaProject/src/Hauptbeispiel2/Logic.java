package Hauptbeispiel2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Logic {
    public  int[] randIntArray(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public double avarage(int[] numbers){
        double average = Arrays.stream(numbers).average().getAsDouble();
        return average;
    }

    public  String[] randomStringArray(String[] StringArrayList){
        Random random = new Random();
        String[]randomStringArray = new String[10];
        for(int i =0; i <randomStringArray.length; i++){
            randomStringArray[i] = StringArrayList[random.nextInt(StringArrayList.length)];
        }
        return randomStringArray;
    }

    public List<String> upperCase(String[] array){

    }



}
