package soal4;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pemeriksaan> daftarPemeriksaan = new ArrayList<>();

        daftarPemeriksaan.add(new Pemeriksaan("P01", "Yanto", "dr. Ratna", 200000));
        daftarPemeriksaan.add(new Pemeriksaan("P02", "Budi", "dr. Rusdi", 150000));
        daftarPemeriksaan.add(new Pemeriksaan("P03", "Tedy", "dr. Rojak", 185000));

        System.out.println("----- Daftar Pemeriksaan -----");
        double totalBiaya = 0;
        for (Pemeriksaan p : daftarPemeriksaan) {
            p.tampilData();
            totalBiaya += p.hitungTotal();
            System.out.println("-----------------");
        }
        System.out.println("Total biaya semua: Rp" + totalBiaya);
    }    
}
