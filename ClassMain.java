
public class ClassMain {
    public static void main(String[] args) {
        // Creates a new class of Class
        Class c = new Class();
        c.print();
        c.print();

        System.out.println();
        
        // increasing the static count but not defining a variable
        new Class();

        System.out.println();


        Class c3 = new Class();
        c3.print();

        foo(5);
    }

    static void foo(int x) {
        System.out.println(x*10);
    }
}