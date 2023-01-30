public class operasiboolean {
    public static void main(String[] args) {
        var tugas = 75;
        var akhir = 80;
        var lulustugas = tugas >= 75;
        var lulusakhir = akhir >= 85;
        var lulus = lulusakhir && lulustugas;
        System.out.println(lulus);

        var Tugas = 70;
        var Akhir = 65;
        var ltugas = Tugas >= 75;
        var lakhir = Akhir >= 60;
        var luluss = ltugas || lakhir;
        System.out.println(luluss);
    }
}
