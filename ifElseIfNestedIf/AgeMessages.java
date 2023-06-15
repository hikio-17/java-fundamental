import java.util.Scanner;

public class AgeMessages {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int umur;

      System.out.println("Berapa umur kamu? ");
      umur = input.nextInt();

      System.out.println("Kamu dapat : ");
      if (umur >= 18) {
         System.out.println("membuat Surat Izin Mengemudi (SIM).");
      }
      if (umur >= 17) {
         System.out.println("membuat Kartu Tanda Penduduk (KTP).");
      }
      if (umur >= 25) {
         System.out.println("Menikah diusia ideal.");
      }
   }   
}
