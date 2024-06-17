import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Создаем список чисел для тестирования
        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        // Создаем список слов для тестирования
        List<String> words = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "grape"));

        // Создаем список строк для тестирования задания 4
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        // Вызываем метод для печати нечетных чисел
        System.out.println("Нечетные числа:");
        printOddNumbers(numbers);

        // Вызываем метод для печати уникальных четных чисел в порядке возрастания
        System.out.println("\nУникальные четные числа в порядке возрастания:");
        printUniqueEvenNumbers(numbers);

        // Вызываем метод для печати уникальных слов
        System.out.println("\nУникальные слова:");
        printUniqueWords(words);

        // Вызываем метод для печати количества дублей для каждого уникального слова
        System.out.println("\nКоличество дублей для каждого уникального слова:");
        printWordDuplicatesCount(strings);
    }

    public static void printOddNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    public static void printUniqueEvenNumbers(List<Integer> numbers) {
        Set<Integer> uniqueEvenNumbers = new TreeSet<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                uniqueEvenNumbers.add(number);
            }
        }

        for (int number : uniqueEvenNumbers) {
            System.out.println(number);
        }
    }

    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public static void printWordDuplicatesCount(List<String> words) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
