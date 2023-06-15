import java.util.Scanner;

public class JobVacancy {
   public static void main(String[] args) {
      // Deklarasi variable
      int umur, pengalaman;
      double penampilan;
      String lulusan, nama, jenisKelamin, posisi, hasil;
      boolean isPassing;

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

      System.out.println("Posisi yang dilamar (Admin, atau Koordinator)");
      posisi = input.next();

      // Kondisi if untuk menentukan Posisi yang dipilih
      if (posisi.equalsIgnoreCase("Koordinator")) {

         isPassing = validateAdmin(umur, jenisKelamin, lulusan, pengalaman, penampilan);

         if (isPassing) {
            hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai" + posisi
                  + ". Dan akan masuk ke Tahap Selanjutnya.";
         } else {
            hasil = "Maaf, " + nama + ".\nAnda Tidak memenuhi syarat sebagai" + posisi
                  + ". Dan Tidak akan masuk ke Tahap Selanjutnya.";
         }
      } else if (posisi.equalsIgnoreCase("Admin")) {

         isPassing = validateAdmin(umur, jenisKelamin, lulusan, pengalaman, penampilan);

         // Kondisi if untuk Menentukan Hasil KKelulusan Posisi Admin
         if (isPassing) {
            hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi
                  + ". Dan akan masuk ke Tahap Selanjutnya.";
         } else {
            hasil = "Maaf, " + nama + ".\nAnda Tidak memenuhi syarat sebagai " + posisi
                  + ". Dan Tidakakan masuk ke Tahap Selanjutnya.";
         }

      } else {
         hasil = "Maaf Posisi yang Anda Cari Tidak Tersedia.";
      }
      printResult(nama, hasil, posisi);
   }

   // Membuat function untuk validasi Posisi Koordinator
   // Method return value berupa boolean
   public static boolean validateKoordinator(int umur, String jenisKelamin, String lulusan, int pengalaman,
         double penampilan) {
      // deklarasi variable lokal
      boolean reqKoor1, reqKoor2, result;

      // Membuat kondisi setiap kriteria koordinator;
      reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30
            && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;

      reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1")
            && pengalaman >= 5;

      if (reqKoor1 || reqKoor2) {
         result = true;
      } else {
         result = false;
      }

      return result;
   }

   // Membuat function untuk validasi Posisi Koordinator
   // Method return value berupa boolean
   public static boolean validateAdmin(int umur, String jenisKelamin, String lulusan, int pengalaman,
         double penampilan) {
      // deklarasi variable lokal
      boolean reqAdmin1, reqAdmin2, reqAdmin3, result;

      // Membuat kondisi setiap kriteria Admin;
      reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 30
            && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);

      reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1")
            && penampilan >= 8.5 || pengalaman >= 3;

      reqAdmin3 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 && penampilan >= 8.5
            && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2;

      if (reqAdmin1 || reqAdmin2 || reqAdmin3) {
         result = true;
      } else {
         result = false;
      }

      return result;
   }

   // Membuat function untuk menampilkan Hasil Rekrutmen
   // Method atau function berupa VOID
   public static void printResult(String nama, String hasil, String posisi) {
      System.out.println();
      System.out.println(nama + ", Terima Kasih Sudah mengikuti Lowongan Ketja di PT. Secret Semut 79.\n");
      System.out.println("Berikut adalah Hasil dari Rekrutmen untuk Posisi " + posisi + " :");
      System.out.println(hasil);
   }
}
