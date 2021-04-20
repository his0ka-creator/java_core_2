package Lesson1;

public class Treadmill{
    private String id;
    private int length;

    Treadmill(String id, int length){
        this.id=id;
        this.length=length;
    }



    public void obstruct(Runable subject){
        subject.run(length);
    }


}

