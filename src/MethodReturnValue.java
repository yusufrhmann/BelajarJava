public class MethodReturnValue {
    public static void main(String[] args) {
        double a = 199;
        double b = 176;
        double c = 14;
        double d = sum(a, b, c);
        System.out.println(d);
        System.out.println(sum2(20, "%" , 43));

    }
    static double sum(double value1, double value2, double value3) {
        double total = (value1 + value2) / value3;
        return total;
    };
    static double sum2(double v1, String operasi, double v2) {
        switch (operasi) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "/":
                return v1 / v2;
            case "*":
                return v1 * v2;
            case "%":
                return v1 % v2;
            default:
                return  31212012;
        }
    }

}
