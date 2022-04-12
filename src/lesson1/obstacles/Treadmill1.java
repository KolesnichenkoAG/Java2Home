package lesson1.obstacles;
import lesson1.correctFiles.Participant;

public class Treadmill1 implements Obstacles{
    private final int length;

    public Treadmill1(int length) {
        this.length = length;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.run() > length) {
            System.out.printf("Участник %s успешно пробежал по дорожке длиной %d метров %n",
                    participant, length);
            return true;
        }
        System.out.printf("Участник %s НЕ СМОГ ПРОБЕЖАТЬ по дорожке длиной %d м %n",
                participant, length);
        return false;
    }
}
