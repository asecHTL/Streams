package Hauptbeispiel2;

import sun.rmi.runtime.Log;

import java.util.Random;

public class Main {
    static int[]randomIntArray = new int[1000];
    public static Logic logic = new Logic();


    public static void main(String[] args) {
        //BSP 1:
        logic.randIntArray(randomIntArray);
        //BSP 2:
        logic.avarage(randomIntArray);
    }


}
