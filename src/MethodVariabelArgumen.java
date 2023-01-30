public class MethodVariabelArgumen {
    public static void main(String[] args) {
        Lulus("Yusuf", 74, 75, 77, 40);

    }// variabel argumen(...)(ARRAY)
    static void Lulus(String name, double... values){
        double total = 0;
        for (double a : values) {
            total = total + a;
        } double HasilAkhir = total / values.length;
        if (HasilAkhir >= 75){
            System.out.println("SELAMAT " + name + " ANDA LULUS");
        } else {
            System.out.println("MAAF " + name + " ANDA BELUM LULUS" );
        }
    }
}
