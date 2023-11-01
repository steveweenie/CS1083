import java.util.*;
class RandomEx1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] count = new int[50];
        for (int i = 1; i<=10; i++) {
            int randomNumber = rnd.nextInt(50)+1;
            count[randomNumber]++;
        }
        for (int i = 1; i < 50; i++) {
            System.out.println("Number " + i +" appeared " + count[i] + " times");
        }
    }
}