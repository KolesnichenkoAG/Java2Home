package lesson1;

public class Robot {
    private int age;
    private int speedRunning;
    private  int heightJump;

    public Robot(int age, int speedRunning, int heightJump) {
        this.age = age;
        this.speedRunning = speedRunning;
        this.heightJump = heightJump;
    }
    public void run() {
        System.out.println("Robot run ---" + speedRunning);
    }
    public void jump() {
        System.out.println("Robot jump ---" + heightJump);
    }
}
