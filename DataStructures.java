import java.util.ArrayList;
import java.util.Stack;

public class DataStructures {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        
        stack.push("stack 1");
        System.out.println(stack.push("stack 2")+'\n');
        stack.push("stack 3");
        stack.push("stack 4");

        while(!stack.empty())
            System.out.println(stack.pop());
        

        System.out.println("----------");

        ArrayList<String> array = new ArrayList<String>();
        array.add("Volvo");
        array.add("BMW");
        array.add("Ford");
        array.add("Mazda");
        System.out.println(array);

        for(int i=0; i<array.size(); i++) {
            System.out.println(array.get(i));
        }
        System.out.println();
        for(String cars : array) {
            System.out.println(cars);
        }
    }
}