package dll;
public class Mahasiswa14 {
    public String nim;
    public String nama;
    public String kelas;
    public double ipk;

    public Mahasiswa14(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk;
    }
}