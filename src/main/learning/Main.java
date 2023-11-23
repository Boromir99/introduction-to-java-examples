package learning;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Integer> occurrences = new HashMap<>();

        System.out.println("Enter integers (enter a non-integer to finish):");

        // Read integers until a non-integer is entered
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }
            // Find the number with the most occurrences
            int mostOccurringNumber = 0;
            int maxOccurrences = 0;

            for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
                if (entry.getValue() > maxOccurrences) {
                    mostOccurringNumber = entry.getKey();
                    maxOccurrences = entry.getValue();
                }
            }

        // Display the result
        System.out.println("The number with the most occurrences is: " + mostOccurringNumber);
        System.out.println("Number of occurrences: " + maxOccurrences);
        }

    }




