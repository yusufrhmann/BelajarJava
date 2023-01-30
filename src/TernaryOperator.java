public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 90;
        // tanpa ternary
        String ucapan;
        if(nilai >= 70) {
            System.out.println("SELAMAT ANDA LULUS");
        }
        else{
            System.out.println("SILAHKAN COBA LAGI");
        }
        // dengan ternary
        String ucapan2 = nilai >= 70 ? "SELAMAT ANDA LULUS":"SILAHKAN COBA LAGI";
        System.out.println(ucapan2);
    }
}
