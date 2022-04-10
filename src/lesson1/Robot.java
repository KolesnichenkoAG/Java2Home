package lesson1;

public class Robot {
    private int distanceRunning;
    private  int heightJump;

    public Robot(int distanceRunning, int heightJump) {
        this.distanceRunning = distanceRunning;
        this.heightJump = heightJump;
    }
    public void run(Treadmill treadmill) {
        if (treadmill.getRunning() > distanceRunning) {
            System.out.println("Robot couldn't run");
        }
        if (treadmill.getRunning() <= distanceRunning) {
            System.out.println("Robot run successfully ran");
        }
    }
    public void jump(Wall wall) {
        if (wall.getHeight() > heightJump){
            System.out.println("Robot couldn't jump over");
        }
        if (wall.getHeight() <= heightJump) {
            System.out.println("Robot passed an obstacle");
        }
    }
}
