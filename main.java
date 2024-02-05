import java.util.Scanner;

public class main {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Set Notation to Table! ");
        System.out.println("Example: {104,1223,242,523}");
        System.out.println("Please Enter The Set Notation: ");

        
        String setNotation = scan.nextLine();
        displaySetNotation set = new displaySetNotation(setNotation);
        set.displaySetNotationMap();
    }
}