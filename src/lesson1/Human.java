package lesson1;

public class Human {
    private int age;
    private int distanceRunning;
    private  int heightJump;

    public Human(int age, int distanceRunning, int heightJump) {
        this.age = age;
        this.distanceRunning = distanceRunning;
        this.heightJump = heightJump;
    }
    public void run(Treadmill treadmill) {
        if (treadmill.getRunning() > distanceRunning){
            System.out.println("Human couldn't run");
        }
        if (treadmill.getRunning() <= distanceRunning) {
            System.out.println("Human run successfully ran");
        }
    }

    public void jump(Wall wall) {
        if (wall.getHeight() > heightJump){
            System.out.println("Human couldn't jump over");
        }
        if (wall.getHeight() <= heightJump) {
            System.out.println("Human passed an obstacle");
        }
    }
}
