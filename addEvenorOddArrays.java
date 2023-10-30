import java.util.Scanner;

public class addEvenorOddArrays {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in); // Scanner definition
    double result = 0;
    /* Declare here your variables */
    int size, evenOrOdd;
    size = scnr.nextInt();
    
    /* After getting the number of double values, define the array */
    double[] arr = new double[size];
      
    /* Get the values form the user and insert them to the array */
    for(int i = 0; i < size; i++){
        arr[i] = scnr.nextDouble();
    }
    /* Get the value to know if is wanted the even or the odd numbers */
    evenOrOdd = scnr.nextInt();
      
    /* Iterate through the array to go adding the values depending if the input was odd or even */
    if(evenOrOdd == 0){ // even Index sum
        for(int i = 0; i < size; i+=2){
            result = result + arr[i];   
        }
        
    }else if(evenOrOdd == 1){ // odd Index sum
        for(int i = 1; i < size; i+=2){
            result = result + arr[i];    
        }
    }
      
    /* Show your result */
    System.out.println(result);
    }
}