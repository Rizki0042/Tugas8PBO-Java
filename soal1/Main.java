package soal1;

public class Main {
    public static void main(String[] args) {
        Buku B1 = new Buku("BK001", "Pulang", "Tere Liye", 90000);
        Buku B2 = new Buku("BK002", "Pergi", "Tere Liye", 90000);
        Buku B3 = new Buku("BK003", "Laskar Pelangi", "Andrea Hirata", 95000);
        Buku B4 = new Buku("BK004", "Rembulan Tenggelam di Wajahmu", "Tere Liye", 95000);

        System.out.println("----- Data Buku -----");
        B1.tampilData();
        B2.tampilData();
        B3.tampilData();
        B4.tampilData();
    }
}
