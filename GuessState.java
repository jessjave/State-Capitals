import java.util.*;

public class Main {
    public static void main (String [] args) {
        //The 50 states and their capitals stored in a two-dimensional array in order by state name//
        /*Initialized an array with the data type of String with the title of stateCapitals with 2 dimensions
        The first row corresponds with the states and the second row corresponds with that state's capital*/
        String [][] stateCapitals = {
            {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"},
            {"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne"}
        };
        
        //Display the current contents of the array//
        /*First declare a variable to display the number of columns as each column = a state and their capital
        Then utilize a for loop to walk through the array and display each column with both rows*/
        int len = stateCapitals[0].length;
        for (int i = 0; i < len; i++) {
            System.out.println(stateCapitals[0][i] + "'s capital is " + stateCapitals[1][i]);
        };
        
        //Use a bubble sort to sort the content by capital//
        //Use the compareto() method to compare the lengths of the strings in the "Capitals" section of the array//
        //swap stateCapitals[1][j] and stateCapitals[1][i] and create a temporary holding variable, then flip one to the other//
        String temp;
	    System.out.println("\nCapital cities in sorted order:");
	        for (int j = 0; j < stateCapitals[0].length; j++) {
   	            for (int i = j + 1; i < stateCapitals[0].length; i++) {
		            // comparing adjacent strings
		            if (stateCapitals[1][i].compareTo(stateCapitals[1][j]) < 0) {
			            temp = stateCapitals[1][j];
			            stateCapitals[1][j] = stateCapitals[1][i];
			            stateCapitals[1][i] = temp;
		}
	   }
	   System.out.println(stateCapitals[1][j]);
      }
      //Prompt the user to enter answers for all the state capitals and then display the total correct count//
        Scanner scanner = new Scanner(System.in); //Create a Scanner object//
        int count = 1;
    do{
        System.out.println("\nNow you must guess all 50 state capitals.\nEnter a state capital: ");
        String userInput = scanner.nextLine(); //Read user input//
    
        boolean answer = false; //Initialize variable default to false unless loop conditions are met//
        //Define an array with the second row from our original array to search for the user's answer//
        String[] capitalCities = stateCapitals[1];
        
        //Walk through newly defined subarray to compare user's input to array components ignoring cap sensitivity//
        for (String cityAnswer:capitalCities) {
            if (cityAnswer.equalsIgnoreCase(userInput)) {
                answer = true;
                break;}
            }
        //If match was found notify the user//
        if (answer) {
            System.out.println("Yes, " + userInput + " is a state capital. You have guessed " + count + " capitals correctly.");
            count++;
        }
        //If not display an alternate message//
        else
            System.out.println("No, " + userInput + " is not a state capital.");
    } while (count < 50);
 }
 }
