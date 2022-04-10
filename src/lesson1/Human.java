package lesson1;

public class Human {
    private int age;
    private int speedRunning;
    private  int heightJump;

    public Human(int age, int speedRunning, int heightJump) {
        this.age = age;
        this.speedRunning = speedRunning;
        this.heightJump = heightJump;
    }
    public void run() {
        System.out.println("Human run ---" + speedRunning);
    }
    public void jump() {
        System.out.println("Human jump ---" + heightJump);
    }
}
