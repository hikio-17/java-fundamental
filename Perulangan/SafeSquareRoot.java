import java.util.Scanner;

public class SafeSquareRoot {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      double x, y;
      
      System.out.println("Give me a numbe, and I'll find it's square root.");
      System.out.println("(No negative, please.) ");
      x = keyboard.nextInt();

      while(x < 0) {
         System.out.println("I won't take the square root of a negative.");
         System.out.println("\nNew number: ");
         x = keyboard.nextInt();
      }

      y = Math.sqrt(x);

      System.out.println("The square root of " + x + " is " + y);
   }
}
