package lesson1.obstacles;
import lesson1.correctFiles.Participant;

    public class Wall implements Obstacles {
    private final int height;

    public Wall(int length) {
        this.height = length;
    }

    @Override
    public boolean passObstacleBy(Participant participant) {
        if (participant.jump() > height) {
            System.out.printf("Участник %s успешно перепрыгнул через стену высотой %d м %n",
                    participant, height);
            return true;
        }
        System.out.printf("Участник %s НЕ СМОГ ПЕРЕПРЫГНУТЬ через стену высотой %d м %n",
                participant, height);
        return false;
    }

}
