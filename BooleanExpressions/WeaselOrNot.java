import java.util.Scanner;

public class WeaselOrNot {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String word;
      boolean yep, nope;

      System.out.println("Type the word \"weasel\", please.");
      word = keyboard.next();
      yep = word.equals("weasel");
      nope = !word.equals("weasel");

      System.out.println("Your typed what was requested: " + yep);
      System.out.println("Your ignored polite instructions: " + nope);
   }
}
