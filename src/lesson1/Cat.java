package lesson1;

public class Cat {
    private int age;
    private int speedRunning;
    private  int heightJump;

    public Cat(int age, int speedRunning, int heightJump) {
        this.age = age;
        this.speedRunning = speedRunning;
        this.heightJump = heightJump;
    }
    public void run() {
        System.out.println("Cat run ---" + speedRunning);
    }
    public void jump() {
        System.out.println("Cat jump ---" + heightJump);
    }
}
