public class ELSEIFexpression {
    public static void main(String[] args) {
        int nilai = 90;
        int tugas = 75;
        double akhir = ((double)(nilai + tugas)/2);
        if (akhir >= 75) {
            System.out.println("Nilai Anda A");
        } else if (akhir >= 65) {
            System.out.println("Nilai Anda B");
        } else if (akhir >= 55) {
            System.out.println("Nilai Anda C");
        } else {
            System.out.println("HAHAHA NGULANG");
        }
        System.out.println(akhir);
    }
    }
