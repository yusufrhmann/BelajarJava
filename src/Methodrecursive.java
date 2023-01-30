public class Methodrecursive {
    public static void main(String[] args) {
        System.out.println(Factorial(10));
        System.out.println(Fk(10));


    }
// faktorial
    static long Factorial(long b) {
        long hasil = 1;
        for (long a = b; a >= 1; a--) {
            hasil = hasil * a;
        }
        return hasil;
    }
        static long Fk(long A) {
            if (A >= 1){
                return A * Fk(A-1);
            }
            else {
                return 1;
            }
        }
    }

