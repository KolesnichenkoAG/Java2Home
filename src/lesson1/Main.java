package lesson1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Java 2 ");
        Human human = new Human(33, 15, 1);
        Cat cat = new Cat(5, 8, 2);
        Robot robot = new Robot (20,3);
        Treadmill treadmill = new Treadmill(10);
        Wall wall = new Wall(2);
        human.run(treadmill);
        human.jump(wall);
        cat.run(treadmill);
        cat.jump(wall);
        robot.run(treadmill);
        robot.jump(wall);
    }
}
