public class CONTINUE {
    public static void main(String[] args) {
        for (var counter2 = 100; counter2 <= 110; counter2 += 1) {
            if (counter2 % 2 != 0) {
                continue;
            }
            System.out.println(counter2);
        }
    }

}