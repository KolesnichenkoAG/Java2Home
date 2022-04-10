package lesson1;

public class Cat {
    private int age;
    private int distanceRunning;
    private  int heightJump;

    public Cat(int age, int distanceRunning, int heightJump) {
        this.age = age;
        this.distanceRunning = distanceRunning;
        this.heightJump = heightJump;
    }
    public void run(Treadmill treadmill) {
        if (treadmill.getRunning() > distanceRunning) {
            System.out.println("Cat couldn't run");
        }
        if (treadmill.getRunning() <= distanceRunning) {
            System.out.println("Cat run successfully ran");
        }
    }
    public void jump(Wall wall) {
        if (wall.getHeight() > heightJump){
            System.out.println("Cat couldn't jump over");
        }
        if (wall.getHeight() <= heightJump) {
            System.out.println("Cat passed an obstacle");
        }
    }
}
