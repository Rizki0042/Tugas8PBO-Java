package soal5;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("     DATA PEMESANAN TIKET     ");
        System.out.println("================================");

        ArrayList <Tiket> daftarTiket = new ArrayList<>();
        
        daftarTiket.add(new Tiket("T01", "Avengers: DoomsDay", "VIP", 75000, 13));
        daftarTiket.add(new Tiket("T02", "Bapak Paling Jujur", "Reguler", 35000, 5));
        daftarTiket.add(new Tiket("T03", "Mortal Kombat II", "VIP", 35000, 3));

        double totalSemua = 0;
        for (Tiket t: daftarTiket) {
            t.tampilData();

            totalSemua += t.hitungTotal();
            System.out.println("------------------------");
        }
        System.out.println("Total Semua: Rp" + totalSemua);
    }
}
