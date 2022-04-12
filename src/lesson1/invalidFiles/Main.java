package lesson1.invalidFiles;

public class Main {

    public static void main(String[] args) {
        System.out.println("Java 2 ");
        Human human = new Human(33, 15, 1);
        Cat cat = new Cat(5, 8, 2);
        Robot robot = new Robot (20,3);
        Treadmill2 treadmill = new Treadmill2(10);
       // Wall wall = new Wall(2);
        Object [] players = new Object [3];
        players [0] = human;
        players [1] = cat;
        players [2] = robot;
        Object [] obstacles = new Object [2];
        obstacles [0] = treadmill;
        // obstacles [1] = wall;
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }

        human.run(treadmill);
        //human.jump(wall);
        cat.run(treadmill);
        //cat.jump(wall);
        robot.run(treadmill);
        //robot.jump(wall);
    }
    public void passingObstacles () {

        for (int i = 0; i <3; i++){

        }
    }
}
