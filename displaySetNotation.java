import java.util.Map;
import java.util.HashMap;

public class displaySetNotation 
{
    Map<Integer, String> setNotationMap = new HashMap<>();
    int size;
    String setNotation;
    public displaySetNotation(String setNotation) {
        this.setNotation = setNotation;
        size = 0;
        formatSetNotation();
        inputSetNotationIntoMap();
    } 

    public void displaySetNotationMap() {
        String set;
        System.out.println("Size of Set: " + size);
        for (int i = 0; i < size;i++) {
            System.out.print(i + ". |\t");
            set = setNotationMap.get(i);
            for (int j = 0; j < set.length();j++) {
                System.out.print(set.substring(j, j+1) + "\t");
            }
            System.out.println("|");
        }
    }

    private void inputSetNotationIntoMap() {
        String word = "";
        for (char c : this.setNotation.toCharArray()) {
            if (c != ',') {
                word += c;
            } else {
                setNotationMap.put(size,word);
                size++;
                word = "";
            }
        }

        if (!word.isEmpty()) {
            setNotationMap.put(size,word);
            size++;
        }
    }

    private void formatSetNotation() {
        int front = setNotation.indexOf("{");
        int back = setNotation.indexOf("}");
        setNotation = setNotation.substring(front + 1, back);
    }
}
