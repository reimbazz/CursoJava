package ExemploMap;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("Phone","99711122");

        cookies.remove("email");
        cookies.put("Phone", "99775536");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("Phone"));
        System.out.println("Phone number: " + cookies.get("Phone"));

        System.out.println("All cookies: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
