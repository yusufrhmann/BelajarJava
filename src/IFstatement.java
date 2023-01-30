public class IFstatement {
    public static void main(String[] args) {
        var nilai = 70;
        var tugas = 80;
        if (nilai >= 75 && tugas >= 75) {
            System.out.println("Selamat Anda Lulus");
        }
        if (nilai < 75 || tugas < 75) {
            System.out.println("HAHAHA GA LULUS");
        }
    }
}
