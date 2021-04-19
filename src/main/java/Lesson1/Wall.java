package Lesson1;

public class Wall {
    private String id;
    private int height;

    public Wall(String id, int height) {
        this.id = id;
        this.height = height;
    }

    public void obstruct(Jumpable subject){
        subject.jump(height);
    }
}
