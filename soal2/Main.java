package soal2;

public class Main {
    public static void main(String[] args) {
        Sepeda S1 = new Sepeda("SPD01", "Sepeda Gunung", 5, 15000);
        Sepeda S2 = new Sepeda("SPD02", "Sepeda Lipet", 5, 10000);

        System.out.println("------- Data Rental Sepeda -------");
        S1.tampilData();
        S2.tampilData();
    }
}
