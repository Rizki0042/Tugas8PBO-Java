package soal3;

public class Main {
    public static void main(String[] args) {
        Menu m1 = new Menu();
        Menu m2 = new Menu("M01", "Nasi Goreng", 18000, "Makanan");

        int jumlah = 2;
        System.out.println("----- Menu 1 -----");
        m1.tampilMenu();        //hasil dari construction kosong
        System.out.println();
        
        System.out.println("----- Menu 2 -----");
        m2.tampilMenu();        //hasil dari menggunakan construction
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Harga: Rp" + m2.hitungHarga(jumlah));

        System.out.println();
    }
}
