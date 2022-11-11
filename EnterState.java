import java.util.*;

public class Main {
    public static void main (String [] args) {
        
        String [][] stateCapitals = {
            {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"},
            {"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne"}
        };
    
    //Now revise the code to store the pairs of each state and its capital in a Map using the HashMap function//
    //Initialized the Hashmap and used a loop to assign the states as keys and capitals as values//
        HashMap<String, String> Map = new HashMap<>(stateCapitals[0].length); 
        for (int i = 0; i < stateCapitals[0].length; i++) {
            Map.put(stateCapitals[0][i], stateCapitals[1][i]);
        }
         System.out.println(Arrays.asList(Map)); //Display the content of the Map//
         
    //Use the TreeMap class to sort the map while using a binary search tree for storage//
      TreeMap<String, String> mapSort = new TreeMap<>(Map);
    //Prompt the user to enter a state and it should then display the capital for the state.//
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
        while (!quit) {
            //Prompt to enter the state. If they want to exit, type ‘quit’//
            System.out.println("\nEnter a state to receive its' capital: ");
            String stateInput = scanner.nextLine();
            if (stateInput.equals("quit")) {
                quit = true;
                continue;
            }
            //If user enters correct state name, check the TreeMap for the corresponding key-value pair//
            if (mapSort.containsKey(stateInput)) {
                System.out.println("The capital of " + stateInput + " is " + mapSort.get(stateInput));
            }
            else {
                System.out.println("Please try again, or type 'quit' to exit the program.");
}
}
}
}
