public class switchlambda {
    public static void main(String[] args) {//tidak perlu break
        var nilai = "f";
        switch (nilai) {
            case "A" -> System.out.println("cieee cumlaud");
            case "B" -> System.out.println("ALhamdulillah lulus");
            case "C" -> System.out.println("yg penting lulus");
            case "D" -> System.out.println("yahaha ngulang");
            default -> System.out.println("Kamu Salah jurusan");
        }
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "cieee cumlaud";
            case "B" -> ucapan = "ALhamdulillah lulus";
            case "C" -> ucapan = "yg penting lulus";
            case "D" -> ucapan = "yahaha ngulang";
            default -> ucapan = "Kamu Salah jurusan";
        }
        System.out.println(ucapan);
        String ucapan2 = switch (nilai) {
            case "A": yield "cieee cumlaud";
            case "B" : yield "ALhamdulillah lulus";
            case "C" : yield "yg penting lulus";
            case "D" : yield "yahaha ngulang";
            default : yield "Kamu Salah jurusan";
        };
        System.out.println(ucapan2);
        }
    }
