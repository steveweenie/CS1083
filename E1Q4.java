import java.util.*;
public class E1Q4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Give a number of integers: ");
        int numofInt = scnr.nextInt();
        int sum = 1;
        
        for (int i = 0; i < numofInt; i++) {
            System.out.println("Input an integer: ");
            int userInput = scnr.nextInt();
            sum = userInput * sum;
        }
        System.out.println(sum);
    }
}