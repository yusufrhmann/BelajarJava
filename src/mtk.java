import java.sql.SQLOutput;

public class mtk {
    public static void main(String[] args) {
        int a = 100;
        int b = 12;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int c = 1000;
        c += 10;
        System.out.println(c);
        c -= 10;
        System.out.println(c);
        c = c/10;
        System.out.println(c);
        c *= 10;
        System.out.println(c);

        int d = 100;
        int e = -10;
        d++;//tambah 1
        System.out.println(d);
        e--;// kurang 1
        System.out.println(e);
        System.out.println(!true);

    }
}
