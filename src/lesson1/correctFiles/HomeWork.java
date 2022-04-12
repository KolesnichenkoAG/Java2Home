package lesson1.correctFiles;
import lesson1.obstacles.Obstacles;
import lesson1.obstacles.Treadmill1;
import lesson1.obstacles.Wall;

    public class HomeWork {
    public static void main(String[] args) {
        Human1 human1 = new Human1("Alex");
        Cat1 cat1 = new Cat1("Raf");
        Robot1 robot1 = new Robot1("Terminator");

        Treadmill1 treadmil1 = new Treadmill1 (180);
        Wall wall = new Wall (2);
        Participant[] participants = {human1, cat1, robot1};
        Obstacles[] obstacles = {treadmil1, wall};

        for (Participant participant : participants) {
            for (Obstacles obstacle : obstacles) {
                if (!obstacle.passObstacleBy(participant)) {
                    System.out.printf("Участник %s ВЫБЫВАЕТ из соревнований %n", participant);
                    break;
                }
            }
        }
    }
}
