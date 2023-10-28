public class E2Q8 {
    
    
    
    public static boolean isInPreviousIndex(int[] numbers, int index) {
        int num = numbers[index];
        for (int i = 0; i < index; ++i) {
            if (numbers[i] == num) {
                
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        int[] numbers = {3, 4, 5,6,7,8,4,6,2,7,8,9,1,2,2,0,7,7};
        if (isInPreviousIndex(numbers, 6)){
            System.out.println("TRUE");
        }
    }
}