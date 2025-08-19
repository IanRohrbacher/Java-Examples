public class Class {
    public int x;
    private int y;
    static int ran = 0;

    public Class() {
        ran +=1;
        
        x = 5;
        y = 10;
    }

    public void print() {
        System.out.println(x + " " + y);
        System.out.println(ran);
        mod();
    }

    private void mod() {
        x += 10;
    }

}