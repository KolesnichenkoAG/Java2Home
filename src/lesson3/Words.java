package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Words {
    public static void main(String[] args) {
        System.out.println("Lesson 3 Home Work");
        List<String> wordList = new ArrayList<>(20);
        wordList.add("Первый");
        wordList.add("Второй");
        wordList.add("Третий");
        wordList.add("Четвертый");
        wordList.add("Первый");
        wordList.add("Первый");
        wordList.add("Второй");
        wordList.add("Третий");
        wordList.add("Пятый");
        wordList.add("Шестой");
        wordList.add("Седьмой");
        wordList.add("Седьмой");
        wordList.add("Седьмой");
        wordList.add("Девятый");
        wordList.add("Десятый");
        wordList.add("Десятый");
        System.out.println(wordList);
        int a = wordList.size();
        System.out.println(a);
    }

}
