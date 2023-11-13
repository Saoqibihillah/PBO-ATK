public class Transaksin {
    String poli;
    String dokter;
    String keterangan;
    int biayaPendaftaran;
    int biayaObat;
    int biayaVitamin;
    int biayaDokter;
    int totalBiaya;

    public Transaksin(String poli, String dokter, String keterangan, int biayaPendaftaran, int biayaObat, int biayaVitamin, int biayaDokter) {
        this.poli = poli;
        this.dokter = dokter;
        this.keterangan = keterangan;
        this.biayaPendaftaran = biayaPendaftaran;
        this.biayaObat = biayaObat;
        this.biayaVitamin = biayaVitamin;
        this.biayaDokter = biayaDokter;
        this.totalBiaya = biayaPendaftaran + biayaObat + biayaVitamin + biayaDokter;
    }
}
