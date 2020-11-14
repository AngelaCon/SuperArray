import java.util.Arrays;
public class Tester {
    public static void main(String[] args) {
        try {
            SuperArray test = new SuperArray(-10);
        } catch (IllegalArgumentException e){
            System.out.println("SuperArray error");
        }
        SuperArray test = new SuperArray(10);
        test.add("sad");
        try {
            test.get(100000);
        } catch (IndexOutOfBoundsException e){
            System.out.println("get() error");
        }
        try {
            test.set(1000, "sad");
        } catch (IndexOutOfBoundsException e){
            System.out.println("set() error");
        }
        try {
            test.add(1000, "sad");
        } catch (IndexOutOfBoundsException e){
            System.out.println("add() error");
        }
        try {
            test.remove(1000);
        } catch (IndexOutOfBoundsException e){
            System.out.println("remove() error");
        }
        try {
            test.add(1,"sad");
            System.out.println(test);
            test.add(-8, "sad");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Error adding sad!");
        }
        // this is Steven Lei's Tester
    }
}
