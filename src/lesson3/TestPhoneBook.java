package lesson3;

import java.util.Set;

public class TestPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "545");
        phoneBook.add("Ivanov", "987");
        phoneBook.add("Novi", "005");
        phoneBook.add("Ivanchyk", "999");

        Set<String> surnames = phoneBook.allSurnames();
        for (String surname : surnames) {
            System.out.printf("Пользователь %s имеет следующие номера телефонов %s %n", surname, phoneBook.get(surname));
        }

    }
}
