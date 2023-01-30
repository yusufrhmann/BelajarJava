public class MethodOverloading {
    public static void main(String[] args) {
        SayHello();
        SayHello("ucup ");
        SayHello("Muhammad", " Yusuf Rahman ");
    }
    static void SayHello(){
        System.out.println("HelloWorld");
    }
    static void SayHello(String name){
        System.out.println(name+"Ganteng");
    }
    static void SayHello(String FirstName, String LastName){
        System.out.println(FirstName + LastName + "Ganteng");
    }

}
