package lesson1.correctFiles;

public class Cat1 implements Participant {
    private final String name;

    public Cat1(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 10;
    }

    @Override
    public int jump() {
        return 1;
    }

    @Override
    public String toString() {
        return "Cat1{" +
                "name='" + name + '\'' +
                '}';
    }
}
