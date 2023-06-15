import java.util.Scanner;

public class JobVacancy {
   public static void main(String[] args) {
      // Deklarasi variable
      int umur, pengalaman;
      double penampilan;
      String lulusan, nama, jenisKelamin, posisi, hasil;
      boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2, reqAdmin3, reqSpv1, reqSpv2;

      Scanner input = new Scanner(System.in);

      // Output Text untuk kebutuhan Data Input User
      System.out.println("Selamat datang di PT. Secret Semut 79");
      System.out.println("==========================\n");

      System.out.println("Silahkan Input Data Anda : \n");
      System.out.println("Nama : ");
      nama = input.next();

      System.out.println("Umur : ");
      umur = input.nextInt();

      System.out.println("Jenis Kelamin (Pria/Wanita) : ");
      jenisKelamin = input.next();

      System.out.println("Lulusan (SMK/D3/S1) : ");
      lulusan = input.next();

      System.out.println("Pengalaman (Tahun) : ");
      penampilan = input.nextDouble();

      System.out.println("Penampilan (1 s.d 10) : ");
      pengalaman = input.nextInt();

      System.out.println("Posisi yang dilamar (Spv, Admin, atau Koordinator)");
      posisi = input.next();


      //Kondisi if untuk menentukan Posisi yang dipilih
      if (posisi.equalsIgnoreCase("Koordinator")) {
         // Membuat kondisi setiap kriteria koordinator
         reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
      
         reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;


         if (reqKoor1 || reqKoor2) {
            hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai" + posisi + ". Dan akan masuk ke Tahap Selanjutnya.";
         } else {
            hasil = "Maaf, " + nama + ".\nAnda Tidak memenuhi syarat sebagai" + posisi + ". Dan Tidak akan masuk ke Tahap Selanjutnya.";
         }
      } else if (posisi.equalsIgnoreCase("Admin")) {
         // Membuat kondisi setiap kriteria Admin
         reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 30 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 ||pengalaman >= 1);

         reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 ||pengalaman >= 3;

         reqAdmin3 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 && penampilan >= 8.5 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2;


         // Kondisi if untuk Menentukan Hasil KKelulusan Posisi Admin
         if (reqAdmin1 || reqAdmin2 || reqAdmin3) {
            hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke Tahap Selanjutnya.";
         } else {
             hasil = "Maaf, " + nama + ".\nAnda Tidak memenuhi syarat sebagai " + posisi + ". Dan Tidakakan masuk ke Tahap Selanjutnya.";
         }

      } else if (posisi.equalsIgnoreCase("SPV")) {
         // Membuat kondisi setiap kriteria SPV
         reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1;

         reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman > 4;

         // Kondisi if untuk menentukan Hasil Kelulusan Posisi SPV
         if (reqSpv1 || reqSpv2) {
            hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke Tahap Selanjutnya.";
         } else {
             hasil = "Maaf, " + nama + ".\nAnda Tidak memenuhi syarat sebagai " + posisi + ". Dan Tidak akan masuk ke Tahap Selanjutnya.";
         }
      } else {
         hasil = "Maaf Posisi yang Anda Cari Tidak Tersedia.";
      }

      System.out.println();
      System.out.println(nama + ", Terima Kasih Sudah mengikuti Lowongan Ketja di PT. Secret Semut 79.\n");
      System.out.println("Berikut adalah Hasil dari Rekrutmen untuk Posisi " + posisi + " :");
      System.out.println(hasil);
   }
}
