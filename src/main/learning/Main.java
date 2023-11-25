package learning;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a map to store state-capital pairs
        Map<String, String> stateCapitalMap = new HashMap<>();

        // Add state-capital pairs to the map
        stateCapitalMap.put("Romania", "Bucuresti");
        stateCapitalMap.put("Italy", "Roma");
        // Add more states and capitals as needed

        // Prompt the user to enter a state
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a state: ");
        String state = scanner.nextLine();

        // Display the capital for the entered state
        if (stateCapitalMap.containsKey(state)) {
            String capital = stateCapitalMap.get(state);
            System.out.println("The capital of " + state + " is " + capital + ".");
        } else {
            System.out.println("Sorry, the capital for " + state + " is not available in the map.");
        }
    }
}


