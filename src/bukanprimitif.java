public class bukanprimitif {
    public static void main(String[] args) {
        Integer iniinteger = 100;
        Long inilong = 10000L;
        Byte iniByte = null;
        System.out.println(iniByte);
        iniByte = 100;
        System.out.println(iniByte);

        int iniint = 10000;

        Integer iniinteger2 = iniint;

        short inishort = iniinteger2.shortValue();
        float inifloat = iniinteger2.floatValue();
        byte inibyte = iniinteger2.byteValue();
        System.out.println(inibyte);

        System.out.println(iniinteger2);
    }
}
