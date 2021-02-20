import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> book = new HashMap<>();

    public void add(String name, String number) {
        HashSet<String> numbers = new HashSet<>();
        if (book.containsKey(name)) {
            book.get(name).add(number);
        } else {
            numbers.add(name);
            book.put(name, numbers);
            book.get(name).add(number);
        }
    }

    public Set<String> get(String name) {
        if (book.containsKey(name)) {
            return book.get(name);
        }
        return new HashSet<>();
    }
}
