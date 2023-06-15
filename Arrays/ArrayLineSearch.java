import java.util.Scanner;

public class ArrayLineSearch {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int[] orderNumbers = {12345, 54321, 101010, 31415, 271829};
      int toFind;

      System.out.print("There are " + orderNumbers.length);
      System.out.println(" orders in the database.");

      System.out.println("Orders: ");
      for(int num: orderNumbers) {
         System.out.println(num + "");
      }
      System.out.println();

      System.out.println("Which order to find? ");
      toFind = keyboard.nextInt();

      for(int num : orderNumbers) {
         if (num == toFind) {
            System.out.println(num + " found.");
         }
      }
   }
}
