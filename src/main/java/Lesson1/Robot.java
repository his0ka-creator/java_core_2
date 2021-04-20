package Lesson1;

public class Robot implements Runable, Jumpable {
    private String model;
    private int maxRunningDistance;
    private int maxJumpingDistance;
    private boolean stillActive;

    public void setStillActive(boolean state){
        this.stillActive=state;
    }
    public boolean getStillActive(){return this.stillActive;}

    Robot (String model, int maxRunningDistance, int maxJumpingDistance){
        this.model=model;
        this.maxRunningDistance=maxRunningDistance;
        this.maxJumpingDistance=maxJumpingDistance;
        setStillActive(true);
    }
    @Override
    public void run(int length){
        if (length <= maxRunningDistance){
            System.out.printf("Robot %s successfully run %d meters\n", model, length);
        }
        else {
            System.out.printf("Robot %s were not able to run %d meters\n", model, length);
            setStillActive(false);
            System.out.printf("!!! Robot %s is out of the race!\n", model);

        }
    }
    @Override
    public void jump(int height){
        if (height <= maxJumpingDistance){
            System.out.printf("Robot %s successfully jumped %d meters\n",model, height);
        }
        else {
            System.out.printf("Robot %s could not jump %d meters\n", model, height);
            setStillActive(false);
            System.out.printf("!!! Robot %s is out of the race!\n", model);

        }
    }
}
