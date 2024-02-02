import java.util.Map;
import java.util.HashMap;

public class displaySetNotation 
{
    // Declare a map to store the set notation
    Map<Integer, String> setNotationMap = new HashMap<>();
    // Declare an integer to store the size of the set
    int size;
    // Declare a string to store the set notation
    String setNotation;

    // Constructor for the class
    public displaySetNotation(String setNotation) {
        // Initialize the set notation
        this.setNotation = setNotation;
        // Initialize the size to 0
        size = 0;
        // Fortmat the set notation
        formatSetNotation();
        // Input the set notation into the map
        inputSetNotationIntoMap();
    } 

    // Method to display the set notation map
    public void displaySetNotationMap() {
        String set;
        // Print the size of the set
        System.out.println("Size of Set: " + size);
        // Loop through the map
        for (int i = 0; i < size;i++) {
            System.out.print(i+1 + ". \t|\t");
            //Get the set notation from the map
            set = setNotationMap.get(i);
            // Loop through the set notation
            for (int j = 0; j < set.length();j++) {
                // Print each character of the set notation
                System.out.print(set.substring(j, j+1) + "\t");
            }
            System.out.println("|");
        }
    }
    // Method to input the set notation into the map
    private void inputSetNotationIntoMap() {
        String word = "";
        // Loop through the set notation
        for (char c : this.setNotation.toCharArray()) {
            // If the character is not a comma, add it to the word
            if (c != ',') {
                word += c;
            } else {
                // If the character is a comma, put the word into the map and increment the size
                setNotationMap.put(size,word);
                size++;
                // Reset the word
                word = "";
            }
        }
        // Check if the word is not empty
        if (!word.isEmpty()) {
            // If the word is not empty, put the word into the map and increment the size
            setNotationMap.put(size,word);
            size++;
        }
    }
    // Method to format the set notation
    private void formatSetNotation() {
        // Find the index of the opening brace in the set notation
        int front = setNotation.indexOf("{");
        // Find the index of the clasing brace in the set notation
        int back = setNotation.indexOf("}");
        // Extract the set notation from between the braces
        setNotation = setNotation.substring(front + 1, back);
    }
}
