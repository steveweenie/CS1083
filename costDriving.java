import java.util.Scanner;

public class costDriving {
   
   public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
      return ((milesDriven / milesPerGallon) * dollarsPerGallon);
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double milesPerGallon = scnr.nextDouble();
      double dollarsPerGallon = scnr.nextDouble();
      
      System.out.printf("%.2f", drivingCost(milesPerGallon, dollarsPerGallon, 10.0));
      System.out.print(" ");
      System.out.printf("%.2f", drivingCost(milesPerGallon, dollarsPerGallon, 50.0));
      System.out.print(" ");
      System.out.printf("%.2f", drivingCost(milesPerGallon, dollarsPerGallon, 400.0));
      System.out.println();
      
   }
}