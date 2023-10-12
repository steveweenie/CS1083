import java.util.*;
class CylinderArea {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Radius: ");
        double radius = scnr.nextInt();
        System.out.println("Height: ");
        double height = scnr.nextInt();
        final double PI = 3.141; 
        double result = (2*(PI)*(radius*radius)+(2*(PI)*(radius*height)));
        System.out.printf("%.2f", result);
        System.out.println();
        
    }
}