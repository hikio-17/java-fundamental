public class OverlyComplexFlag {
   public static void main(String[] args) {
      printTopHalf();
      
      print48Colons();
      print48Ohs();
      print48Colons();
      print48Ohs();
      print48Colons();
      print29Ohs();
   }

   public static void print48Colons() {
      System.out.println("|::::::::::::::::::::::::::::::::::::::::::::::::|");
   }

   public static void print48Ohs() {
      System.out.println("|oooooooooooooooooooooooooooo|");
   }

   public static void print29Colons() {
      System.out.println("|:::::::::::::::::::::::::::::|");
   }

   public static void printPledge() {
      System.out.println("I pledge allegiance to the flag");
   }

   public static void print29Ohs() {
      System.out.println("|oooooooooooooooooooooooooooo|");
   }

   public static void print6Stars() {
      System.out.println("|* * * * * * *|");
   }

   public static void print5Stars() {
      System.out.println("|* * * * * * |");
   }

   public static void printSixStarLine() {
      print6Stars();
      print29Ohs();
   }

   public static void printFiveStarLine() {
      print5Stars();
      print29Colons();
   }

   public static void printTopHalf() {
      System.out.println("_______________________________________________");
      printSixStarLine();
      printFiveStarLine();
      printSixStarLine();
      printFiveStarLine();
      printSixStarLine();
      printFiveStarLine();
   }
}
