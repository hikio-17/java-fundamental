import java.util.Scanner;

public class PigDice {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int roll, ptot, ctot, turnTotal;
      String choice = "";

      ptot = 0;
      ctot = 0;

      do {
         if (ptot < 100) {
            turnTotal = 0;
            System.out.println("Computer has " + ctot + " points.");

            do {
               roll = 1 + (int) (Math.random() * 6);
               System.out.println("\tComputer rolled a " + roll + " ."); 
               if(roll == 1) {
                  System.out.println("\tThat ends its turn");
                  turnTotal = 0;
               } else {
                  turnTotal += roll;
                  System.out.print("\tComputer has " + turnTotal);
                  System.out.print(" point so far this round.\n");
                  if(turnTotal < 10) {
                     System.out.println("\tComputer will roll again.");
                  }
               }
            }while(roll != 1 && turnTotal < 10);

            ctot += turnTotal;
            System.out.println("\tComputer ends the round with. ");
            System.out.println(ctot + " points.\n");
         }

         turnTotal = 0;
         System.out.println("You have " + ptot + " points.");

         do {
            roll = 1 + (int) (Math.random()*6);
            System.out.println("\tYou rolled a " + roll + ".");
            if(roll == 1) {
               System.out.println("\tThat ends your turn.");
               turnTotal = 0;
            } else {
               turnTotal += roll;
               System.out.println("\tYou have " + turnTotal + " points.");
               System.out.println(" so far this round.\n");
               System.out.println("\tWould you like to \"roll\" again");
               System.out.println(" or \"hold\"?");
               choice = keyboard.next();
            }
         }while(roll != 1 && choice.equals("roll"));

         ptot += turnTotal;
         System.out.println("\tYou end the round with " + ptot + " points\n");
      }while(ptot < 50 && ctot < 50);

      if(ptot > ctot) {
         System.out.println("Hummanity wins!!");
      } else {
         System.out.println("The computer wins.");
      }
   }
}
