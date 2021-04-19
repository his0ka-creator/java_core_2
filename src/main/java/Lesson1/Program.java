package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        //Robot r = new Robot();
        Runable[] contestantList = {
                new Robot("T1000",800,30),
                new Robot("R2D2",40,2),
                new Human("Ivan",1200,40),
                new Human("Ignat",600,37),
                new Cat("Barsik",80,74),
                new Cat("Murka",96,38)
        };
        Object[] obstructionList = {
                new Treadmill("WarmUp",8),
                new Wall("Starting wall",2),
                new Treadmill("Second run", 16),
                new Wall("Wall number 2", 4),
                new Treadmill("Final run ",800),
                new Wall("Final wall",29)
        };

        for (Object contestant: contestantList){
            for (Object obstruction : obstructionList){
                if (obstruction instanceof Wall){
                    //(Wall) ((Wall) obstruction).obstruct((Jumpable) contestant);
                }
            }
        }

    }
}