public class scope {
    public static void main(String[] args) {
        sayHello("lay");
    }
    static void sayHello(String name) {
        String hello = "hello " + name;
        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }
        //System.out.println(hi); error karena hi tidak terdapat di block ini
    }
}
