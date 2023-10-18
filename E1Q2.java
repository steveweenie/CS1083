import java.util.*;
class E1Q2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int c = scnr.nextInt();
        int d = scnr.nextInt();
        double f = (double)(a*a-b*b) / (c*c-d*d);
        
        System.out.print("Value: ");
        System.out.printf("%.2f", f);
        System.out.println(" | Thank you for using my program!");
        
        
    }
}