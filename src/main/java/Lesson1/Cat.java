package Lesson1;

public class Cat implements Runable, Jumpable {
    private String name;
    private int maxRunningDistance;
    private int maxJumpingDistance;
    private boolean stillActive;

    public void setStillActive(boolean state){
        this.stillActive=state;
    }

    Cat (String name, int maxRunningDistance, int maxJumpingDistance){
        this.name=name;
        this.maxRunningDistance=maxRunningDistance;
        this.maxJumpingDistance=maxJumpingDistance;
        setStillActive(true);
    }
    @Override
    public void run(int length){
        if (length <= maxRunningDistance){
            System.out.printf("Cat %s successfully run %d meters\n", name, length);
        }
        else {
            System.out.printf("Cat %s were not able to run %d meters\n", name, length);
            setStillActive(false);
        }
    }
    @Override
    public void jump(int height){
        if (height <= maxJumpingDistance){
            System.out.printf("Cat %s successfully jumped %d meters\n",name, height);
        }
        else {
            System.out.printf("Cat %s could not jump %d meters\n", name , height);
            setStillActive(false);
        }
    }
}
