import java.util.Scanner;

public class Test2Q4 {
   
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       System.out.println("Please select a color: \n 0 Red \n 1 Green \n 2 Blue");
       int userColor = scnr.nextInt();
       
       while ((userColor > 2) || (userColor < 0)) {
           System.out.println("Invalid Choice!");
           System.out.println("Please select a color: \n 0 Red \n 1 Green \n 2 Blue");
           userColor = scnr.nextInt();
       }
       
       System.out.print("Congratulations your color number is: " + userColor);
       
   }
       
    
}