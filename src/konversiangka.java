public class konversiangka {

    public static void main(String[] args) {

        byte inibyte = 10;
        short inishort = inibyte;
        long inilong = inishort;

        int iniint = 127;
        short inishort2 = (short) iniint;
        System.out.println(inishort2);
    }
}
