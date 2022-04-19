package lesson3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {

    Map<String, Set<String>> phoneBySurname = new TreeMap<>();

    public void add(String surname, String phoneNamber) {
        Set<String> phones = phoneBySurname.get(surname);
        if(phones == null) {
            Set<String> phonesSet = new HashSet<>();
            phonesSet.add(phoneNamber);
            phoneBySurname.put(surname, phonesSet);
        } else {
            phones.add(phoneNamber);
            phoneBySurname.put(surname, phones);
        }
    }
    public Set<String> get(String surname) {
        return phoneBySurname.get(surname);
    }
    public Set<String> allSurnames(){
     return phoneBySurname.keySet();
    }
}
