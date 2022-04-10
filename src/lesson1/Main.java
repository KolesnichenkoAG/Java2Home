package lesson1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Java 2");
        Human human = new Human(33, 3, 1);
        Cat cat = new Cat(5, 8, 2);
        Robot robot = new Robot(1, 20,3);
        human.run();
        human.jump();
        cat.run();
        cat.jump();
        robot.run();
        robot.jump();
    }
}
