import java.util.*;
class Factorial {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a positive number (Factorial): ");
        int userNum = scnr.nextInt();
        int factorial = 1;
        int sum = 0;
        
        for (int i = userNum; i >=1; i--) {
            factorial = factorial*i;
            sum = sum + i;
            
        }
        System.out.println(factorial);
        System.out.println(sum);
        
    }
}