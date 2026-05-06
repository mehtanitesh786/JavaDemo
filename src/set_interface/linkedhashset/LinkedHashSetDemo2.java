package set_interface.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> history= new LinkedHashSet<>();
        history.add("Java");
        history.add("Spring Boot");
        history.add("Angular");
        history.add("Java");

        System.out.println(history);

    }
}
