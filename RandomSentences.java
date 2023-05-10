import java.util.Random;
import java.util.Scanner;

public class RandomSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = { "Peter", "Michael", "George", "Jane", "Maria", "Sofia", "Stew", "Victoria" };
        String[] places = { "Sofia", "Plovdiv", "Varna", "Burgas", "Paris", "Moscow", "New York", "Rome" };
        String[] verbs = { "eats", "holds", "sees", "plays with", "brings", "goes", "catches", "cleans", "hits" };
        String[] nouns = { "stones", "cake", "apple", "laptop", "bikes", "banana", "a glass of juice", "a glass of champaign", "sandwich" };
        String[] adverbs = { "slowly", "diligently", "warmly", "sadly", "rapidly", "quickly", "proudly", "quietly" };
        String[] details = { "near the river", "at home", "in the park", "at school", "on the beach", "at the lake", "in the forest", "at the playground", "on the dance floor" };

        System.out.println("Hello, the first randomly generated sentence is:");

        while (true) {
            String randomName = getRandomElementFromStringArray(names);
            String randomPlace = getRandomElementFromStringArray(places);
            String randomVerb = getRandomElementFromStringArray(verbs);
            String randomNoun = getRandomElementFromStringArray(nouns);
            String randomAdverb = getRandomElementFromStringArray(adverbs);
            String randomDetails = getRandomElementFromStringArray(details);

            System.out.printf("%s from %s %s %s %s %s%n", randomName, randomPlace, randomVerb, randomNoun, randomAdverb, randomDetails);
            System.out.println("Press [Enter] if you would like to generate a new sentence.");
            scanner.nextLine();
        }

    }

    public static String getRandomElementFromStringArray (String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }

}
