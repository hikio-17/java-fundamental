import java.util.Scanner;

public class JobVacantion {
   public static void main(String[] args) {
      // Deklarasi variable yang .
      int umur, pengalaman;
      double penampilan;
      String lulusan, nama, jenisKelamin;
      boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
      boolean isPassingKoor, isPassingAdmin;

      Scanner input = new Scanner(System.in);

      // Output Text yang dibutuhkan
      System.out.println("Selamat datang di PT. Secret Semut 79");
      System.out.println("======================================\n");
      System.out.println("Silahkan input Data Anda");

      System.out.println("Nama: ");
      nama = input.next();

      System.out.println("Umur: ");
      umur = input.nextInt();

      System.out.println("Jenis Kelamin (Pria/Wanita) : ");
      jenisKelamin = input.next();

      System.out.println("Lulusan (SMK/D3/S1) : ");
      lulusan = input.next();

      System.out.println("Pengalaman: ");
      pengalaman = input.nextInt();

      System.out.println("Penampilan: ");
      penampilan = input.nextDouble();

      // Persyaratan Kooirdinator 1
      reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;

      // Persyaratan Koordinator 2
      reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;

      //Hasil dari Koordinator
      isPassingKoor = reqKoor1 || reqKoor2;

      //Pesyaratan Admin 1
      reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && lulusan.equalsIgnoreCase("D3") && penampilan >= 8.5 && pengalaman >= 1;

      //Pesyaratan Admin 2
      reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 3;

      // Hasil dari Admin
      isPassingAdmin = reqAdmin1 || reqAdmin2;

      //Membuat Output Text Hasil
      System.out.println();
      System.out.println(nama+ ", Terima kasih sudah mengikuti Lowongan Kerja di PT. Secret Semut 79.\n");
      System.out.println("Berikut adalah hasil dari Rekrutment untuk Koordinasi dan Admin :");
      System.out.println("Hasil Kelulusan untuk Koordinator : " + isPassingKoor);
      System.out.println("Hasil Kelulusan untuk Admin : " + isPassingAdmin);
      
   }
}