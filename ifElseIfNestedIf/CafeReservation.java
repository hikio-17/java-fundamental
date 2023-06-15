import java.util.Scanner;

public class CafeReservation {
   public static void main(String[] args) {
      //Deklarasi variable
      String name, gender, day, result;
      int age;
      double appearance, money;

      Scanner input = new Scanner(System.in);
      

      // Inisialisasi variable
      result = "";

      // Text output untuk Inputan User
      System.out.println("Welcome to Reservation Cafe 79. \n");
      System.out.println("Please insert your name : ");
      name = input.nextLine();

      System.out.println("How old are You?");
      age = input.nextInt();

      System.out.println("What is your Gender (Male/Female) : ");
      gender = input.next();

      System.out.println("How attractive are you? (1 to 10)");
      appearance = input.nextDouble();

      System.out.println("How much money do you have ?");
      money = input.nextDouble();

      System.out.println("What day do you want to make a Reservation?");
      day = input.next();

      // Membuat Kondisi IF untuk setiap Day atau Hari Reservasi
      if (day.equalsIgnoreCase("Monday")) {
         if (age >= 20 && age <= 30 && money >= 500) {
            result = "Reservation Successfully, You can Order on Monday. Young Night.";
         } else {
            result = "Sorry, you can't Order on Monday!!. Because it is for Young Night.";
         }
      } else if (day.equalsIgnoreCase("Tuesday")) {
         if (age >= 31 && age <= 50 && money >= 250) {
            result = "Reservation Successfully, You can Order on Tuesday. Oldest Night.";
         } else {
            result = "Sorry, you can't Order on Tuesday!!. Because it is for Oldest Night.";
         }
      } else if (day.equalsIgnoreCase("Wednesday")) {
         if (gender.equalsIgnoreCase("Female") && age >= 20 && age <= 35 && appearance >= 8 && money >= 300) {
            result = "Reservation Successfully, You can Order on Wednesday. Ladies Night.";
         } else {
            result = "Sorry, you can't Order on Wednesday!!. Because it is for Ladies Night.";
         }
      } else if (day.equalsIgnoreCase("Thurday")) {
         if (gender.equalsIgnoreCase("Female") && age >= 21 && age <= 30 && money >= 300 && appearance >= 8) {
            result = "Reservation Successfully, You can Order on Thurday. Party Night for Single.";
         } else if (gender.equalsIgnoreCase("Male") && age >= 21 && age <= 30 && money >= 1000) {
            result = "Reservation Successfully, You can Order on Thurday. Party Night for Single.";
         } else {
            result = "Sorry, you can't Order on Thurday!!. Because it is Party Night For Single.";
         }
      } else if (day.equalsIgnoreCase("Friday")) {
         if (gender.equalsIgnoreCase("Female") && age >= 31 && age <= 45 && money >= 1000) {
            result = "Reservation Successfully, You can Order on Friday. Women Night.";
         } else if (gender.equalsIgnoreCase("Male") && age >= 21 && age <= 25 && appearance >= 8) {
            result = "Reservation Successfully, You can Order on Friday. Women Night.";
         } else {
            result = "Sorry, you can't Order on Friday!!. Because it is For Women Night.";
         }
      } else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
         if (age >= 18 && age <= 60 && money >= 100) {
            result = "Reservation Successfully, You can Order on Weekend Days. Weekend Freedom.";
         } else {
            result = "Sorry, you can't Order on Weekend Days!!. Because it is For Weekend Freedom.";
         }
      }

      // Output text hasil aplikasi
      System.out.println();
      System.out.println("Hi " + name + ". Thank you for using our Application.");
      System.out.println("Following Results for your Reservation: ");
      System.out.println(result);
   }
}
