public class TollCalculation {
   
   public static double calcToll(int hour, boolean isMorning, boolean isWeekend) {
      if (!(isWeekend)) {
         if (isMorning) {
            if (hour < 7) {
               return 1.15;
            } else if (hour >= 7 && hour < 10) {
               return 2.95;
            } else {
               return 1.90;
            }
         } else {
            if (hour > 3 && hour < 8) {
               return 3.95;
            } else if (hour >= 8) {
               return 1.40;
            } else {
               return 1.90;
            }
         }
      } else {
         if (isMorning) {
               if (hour < 7) {
                  return 1.05;
               } else {
                  return 2.15;
               }
            } else {
               if (hour >= 8) {
                  return 1.10;
               } else {
                  return 2.15;
               }
            }
      }
   }
   

   public static void main(String[] args) {
      System.out.println(calcToll(8, true, false));
      System.out.println(calcToll(1, false, false));
      System.out.println(calcToll(3, false, true));
      System.out.println(calcToll(5, true, true));
   }
}