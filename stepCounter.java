import java.util.Scanner;

public class LabProgram {
   
   public static int feetToSteps(double feet) {
      return (int) (feet / 2.5);
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double feet = scnr.nextDouble();
      System.out.println(feetToSteps(feet));
   }
}
