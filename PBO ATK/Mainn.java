import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("——----------——SELAMAT DATANG DIRUMAH SAKIT WARAS——---------------——");
        System.out.println("===================================================================");
        System.out.println("\n——————————---------------------———0000——-------—-------——————————");

        Pasienn pasienn = new Pasienn();

        System.out.println("*Masukan Data Pasien*");
        System.out.print("Masukan Nama      =   ");
        pasienn.nama = input.nextLine();
        System.out.print("Masukan Alamat    =   ");
        pasienn.alamat = input.nextLine();
        System.out.print("Masukan No.Tlpn  =   ");
        pasienn.noTlpn = input.nextLine();

        System.out.println("\n*Nama Poli*");
        System.out.println("1. Gigi");
        System.out.println("2. Anak");
        System.out.println("3. Umum");
        System.out.print("Pilihan Poli = ");
        int pilihanPoli = input.nextInt();

        String poli = "";
        if (pilihanPoli == 1) {
            poli = "Gigi";
        } else if (pilihanPoli == 2) {
            poli = "Anak";
        } else if (pilihanPoli == 3) {
            poli = "Umum";
        }

        System.out.println("\n*Nama Dokter*");
        System.out.println("1. drg. Ahmad Afandi");
        System.out.println("2. dr. Aris Wicaksono, Sp.A.");
        System.out.println("3. dr. Alfia Putri");
        System.out.print("Pilihan Poli = ");
        int pilihanDokter = input.nextInt();

        String dokter = "";
        if (pilihanDokter == 1) {
            dokter = "drg. Ahmad Afandi";
        } else if (pilihanDokter == 2) {
            dokter = "dr. Aris Wicaksono, Sp.A.";
        } else if (pilihanDokter == 3) {
            dokter = "dr. Alfia Putri";
        }

        input.nextLine(); // Membersihkan newline

        System.out.print("Berikan Keterangan Dokter        = ");
        String keterangan = input.nextLine();

        System.out.print("Masukan Biaya Pendaftaran        Rp. ");
        int biayaPendaftaran = input.nextInt();
        System.out.print("Masukan Biaya Obat               Rp. ");
        int biayaObat = input.nextInt();
        System.out.print("Masukan Biaya Vitamin            Rp. ");
        int biayaVitamin = input.nextInt();
        System.out.print("Masukan Biaya Dokter             Rp. ");
        int biayaDokter = input.nextInt();

        Transaksin transaksin = new Transaksin(poli, dokter, keterangan, biayaPendaftaran, biayaObat, biayaVitamin, biayaDokter);

        System.out.println("\n——————————---------------------———0000——-------—-------——————————");
        System.out.println("===================================================================");
        System.out.println("Poli                                       " + transaksin.poli);
        System.out.println("Dokter                                     " + transaksin.dokter);
        System.out.println("Keterangan                                 " + transaksin.keterangan);
        System.out.println("\nTotal Biaya yang di Bayarkan Pasien  Rp. " + transaksin.totalBiaya);
        System.out.println("\n——-- SALAM SEHAT " + pasienn.nama + " DARI RUMAH SAKIT WARAS —--—");
    }
}
