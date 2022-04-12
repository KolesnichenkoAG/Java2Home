package lesson1.correctFiles;

public class Human1 implements Participant {
    private final String name;

    public Human1(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 190;
    }

    @Override
    public int jump() {
        return 3;
    }

    @Override
    public String toString() {
        return "Human1{" +
                "name='" + name + '\'' +
                '}';
    }
}
