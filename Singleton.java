public class Singleton {
    static Singleton s = null;
    String string;

    public static Singleton getInt(String string) {
        if(s == null) {
            s = new Singleton(string);
        }
        return s;
    }

    private Singleton(String string) {
        this.string = string;
    }

    public void print() {
        System.out.println(string);
    }
    public boolean delete() {
        if (s == null) {
            return false;
        }
        s = null;
        string = null;
        return true;
    }

}