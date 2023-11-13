import java.util.Scanner;

public class MainAtk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Atk[] daftarBarang = {
            new Atk("111", "Buku Tulis SIDU", 32000.0),
            new Atk("112", "Bullpen Biru Pilot", 30000.0),
            new Atk("113", "Penghapus Joyko", 18000.0),
            new Atk("114", "Kertas Paper Me", 42500.0)
        };

        System.out.println("                DAFTAR BARANG ATK            ");
        System.out.println("=============================================");
        System.out.println("Kode\tNama\t\t\tHARGA");
        for (Atk barang : daftarBarang) {
            System.out.printf("%s\t%s\t@Rp.%.1f\n", barang.kodeBarang, barang.namaBarang, barang.hargaBarang);
        }
        System.out.println("=============================================");

        System.out.print("Masukkan Kode Barang\t: ");
        String kodeInput = input.next();
        System.out.print("Masukkan Jumlah Barang\t: ");
        double jumlahInput = input.nextDouble();

        Atk barangTransaksi = null;
        for (Atk barang : daftarBarang) {
            if (barang.kodeBarang.equals(kodeInput)) {
                barangTransaksi = barang;
                break;
            }
        }

        if (barangTransaksi != null) {
            System.out.println("\n            Daftar Transaksi               ");
            System.out.println("=============================================");
            System.out.println("Kode\t\t: " + barangTransaksi.kodeBarang);
            System.out.println("Nama Barang\t: " + barangTransaksi.namaBarang);
            System.out.println("Harga Satuan\t: " + barangTransaksi.hargaBarang);
            System.out.println("Jumlah\t\t: " + jumlahInput);

            double total = barangTransaksi.hitungTotal(jumlahInput);
            System.out.println("Total\t\t: Rp " + total);

            if (total >= 750000) {
                System.out.println("\nBonus Buku 2 Buah  !!");
            } else if (total >= 100000) {
                System.out.println("\nBonus Tipe Ex Kertas 1 Buah  !!");
            } else if (total >= 200000) {
                System.out.println("\nBonus Gel Pen 3 Warna 1 Set  !!");
            }
        } else {
            System.out.println("Kode Barang tidak valid!");
        }
    }
}