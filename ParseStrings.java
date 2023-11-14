import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      boolean quit = false;
      while (!quit) {
         System.out.println("Enter input string:");
         input = scnr.nextLine();
         
         if (input.equals("q")) {
            quit = true;
            continue;
            
         }
         
         if (!input.contains(",")) {
            System.out.println("Error: No comma in string.");
            System.out.println("");
            continue;
         }
         
         String[] words = input.split(",");
         System.out.println("First word: " + words[0].trim());
         System.out.println("Second word: " + words[1].trim());
         System.out.println("");
         
      }
   }
}
