import java.util.Scanner;

class Atk {
    String kodeBarang, namaBarang;
    double hargaBarang;

    Atk(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public double hitungTotal(double jumlah) {
        return hargaBarang * jumlah;
    }
}