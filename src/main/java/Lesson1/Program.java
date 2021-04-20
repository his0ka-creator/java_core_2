package Lesson1;



public class Program {
    public static void main(String[] args) {

        Object[] contestantList = {
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

        for (Object obstruction : obstructionList){
            for (Object contestant: contestantList){
                if (contestant instanceof Human ){
                    if (!((Human) contestant).getStillActive()){
                        continue;
                    }
                }
                if (contestant instanceof Robot ){
                    if (!((Robot) contestant).getStillActive()){
                        continue;
                    }
                }
                if (contestant instanceof Cat){
                    if(!(((Cat) contestant).getStillActive())){
                        continue;
                    }
                }
                if (obstruction instanceof Wall && contestant instanceof Jumpable){
                    ((Wall) obstruction).obstruct((Jumpable) contestant);
                }
                if (obstruction instanceof Treadmill && contestant instanceof Runable){
                    ((Treadmill) obstruction).obstruct((Runable) contestant);
                }
            }
        }

    }
}