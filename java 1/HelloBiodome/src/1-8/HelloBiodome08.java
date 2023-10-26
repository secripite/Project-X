import java.util.Arrays;
import java.util.Comparator;

public class HelloBiodome08 {
    public static void main(String[] args) {
        String[] DICTIONARY = { "hello", "where", "this", "biodome", "help", "tree", "new", "is", "problem", "please",
                "need", "we", "isn’t", "there", "a", "your", "any", "thanks", "the", "for", "solution", "can", "?" };
        Arrays.sort(DICTIONARY, Comparator.comparing(String::length).reversed());

        try {
            String no_space_sent = new String(args[0]);
        } catch (Exception e) {
            System.out.println("재입력 해주십시오.");
        }

        StringBuilder sentence;
        for (int i = 0; i < DICTIONARY.length; i++) {
            System.out.println(DICTIONARY[i]);
        }
    }

}
