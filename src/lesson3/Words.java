package lesson3;

import java.util.*;
import java.util.Map;
import java.util.HashMap;


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
        Set<String> uniqueWord = new HashSet<>(wordList);
        System.out.println(uniqueWord);
        System.out.println();
        totalizer();
    }
    public static void totalizer() {
        Map<String, Integer> frequencyByWord = new HashMap<>();
        for (String word : INPUT_DATA) {
            Integer frequency = frequencyByWord.get(word);
            if (frequency == null) {
                frequency =0;
            }
            frequencyByWord.put(word, frequency +1);
        }
        for (Map.Entry<String, Integer> entry : frequencyByWord.entrySet()) {
            System.out.printf("Слово %s встречаеться %d раз %n", entry.getKey(), entry.getValue());
        }
    }
    private static final String [] INPUT_DATA = {
            "Первый",
        "Второй", "Третий",
                "Четвертый",
                "Первый",
                "Первый",
                "Второй",
                "Третий",
                "Пятый",
                "Шестой",
                "Седьмой",
                "Седьмой",
                "Седьмой",
                "Девятый",
                "Десятый",
                "Десятый"
    };
}
