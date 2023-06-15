import java.util.Scanner;

public class RudeQuestions {
   public static void main(String[] args) {
      String name, hobby;
      int age;
      double weight, income;

      Scanner keyboard = new Scanner(System.in);

      System.out.print("Hello, What is your name? ");
      name = keyboard.next();
      
      System.out.print("Hi, " + name + "! How old are you? ");
      age = keyboard.nextInt();

      System.out.println("So yo're " + age + ", eh? that's not very old.");
      System.out.print("How much do you weigth, " + name + "? ");
      weight = keyboard.nextDouble();
      
      System.out.println(weight + "! Better keep that quiet!!");
      System.out.print("Finally, what's your income, " + name + "? ");
      income = keyboard.nextDouble();

      System.out.print("Hopefully that is " + income + " per hour");
      System.out.println(" and not per year!");

      System.out.println("What's your hobby is " + name + "? ");
      hobby = keyboard.next();
      System.out.println("ohh WOW, your hobby is " + hobby);

      System.out.print("Well, thanks for answering my rude questions, ");
      System.out.println(name + ".");
   }
}