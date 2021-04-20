package Lesson1;

public class Human implements Runable, Jumpable{
    private String name;
    private int maxRunningDistance;
    private int maxJumpingDistance;
    private boolean stillActive;

    public void setStillActive(boolean state){
        this.stillActive=state;
    }

    public boolean getStillActive () {return this.stillActive;}

    Human(String name, int maxRunningDistance, int maxJumpingDistance){
        this.name = name;
        this.maxRunningDistance=maxRunningDistance;
        this.maxJumpingDistance=maxJumpingDistance;
        this.stillActive=true;
    }

    @Override
    public void run(int length){
        if (length <= maxRunningDistance){
            System.out.printf("Human %s successfully run %d meters\n", name, length);
        }
        else {
            System.out.printf("Human %s were not able to run %d meters\n", name, length);
            setStillActive(false);
            System.out.printf("!!! Human %s is out of the race!\n", name);
        }
    }
    @Override
    public void jump(int height){
        if (height <= maxJumpingDistance){
            System.out.printf("Human %s successfully jumped %d meters\n",name, height);
        }
        else {
            System.out.printf("Human %s could not jump %d meters\n", name, height);
            setStillActive(false);
            System.out.printf("!!! Human %s is out of the race!\n", name);
        }
    }
}
