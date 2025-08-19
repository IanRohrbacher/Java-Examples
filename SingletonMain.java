public class SingletonMain {
    public static void main(String args[]) {
        Singleton s = Singleton.getInt("Hello");
        Singleton s2 = Singleton.getInt("World");


        s.print();
        s2.print();

        System.out.println(s.delete());
        System.out.println(s2.delete());
    }
}