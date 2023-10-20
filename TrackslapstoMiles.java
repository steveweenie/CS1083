import java.util.Scanner;

public class TracklapstoMiles {
   
   public static double lapsToMiles(double userLaps) {
      return userLaps * 0.25;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double userLaps = scnr.nextDouble();
      System.out.printf("%.2f\n", lapsToMiles(userLaps));
   }
}
