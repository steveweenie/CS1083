import java.util.Scanner;

public class Test2Q21 {
   
   public static void main(String[] args) {
      int i,j;
      j=0;
      for (i = 0; i <6; i++) {
          for (j=0; j<4; j++) {
              System.out.print((2*(j%4)+3*i)+"\t");
          }
          System.out.println();
          j++;
          }
      }
      
}