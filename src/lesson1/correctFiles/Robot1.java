package lesson1.correctFiles;

public class Robot1 implements Participant {
    private final String name;

    public Robot1(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 1000;
    }

    @Override
    public int jump() {
        return 20;
    }

    @Override
    public String toString() {
        return "Robot1{" +
                "name='" + name + '\'' +
                '}';
    }
}
