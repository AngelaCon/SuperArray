import java.util.Arrays;
public class Tester {
    public static void main(String[] args) {
        /*
        SuperArray words = new SuperArray();
        System.out.println(words.get(0));
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        for (int i = 0;i<50;i++ ){
            words.add(String.valueOf(i));
        }
        */
        /*
        for (int i = 0;i<50;i++ ){
            System.out.println(words.get(i)); // i should be at 46 since 50 - 3 = 47. 47 is 0-46.
        }
        System.out.println(words.size());
        for (int i = 3;i<words.size();i++ ){
            words.set(i, "resized" + String.valueOf(i));
            System.out.println(words.get(i)); // i should be at 46 since 50 - 3 = 47. 47 is 0-46.
        }
        */

        // TESTS FOR PART 2 / HW 15

        // clear() and isEmpty() test
        System.out.println("clear() and isEmpty() test");
        SuperArray test1 = new SuperArray(3);
        test1.add("element1");
        test1.add("element2");
        test1.add("element3");
        test1.clear();
        System.out.println(test1.size());       //0
        System.out.println(test1.isEmpty());    //true
        //

        // contains() and new SuperArray() test
        System.out.println("contains() and new SuperArray() test");
        SuperArray test2 = new SuperArray(3);
        test2.add("dog");
        test2.add("dog");
        test2.add("cat");
        test2.add("meow");
        System.out.println(test2.contains("dog"));  //true
        System.out.println(test2.contains("dag"));  //false
        //

        // toString(), add(), and remove() test
        System.out.println("toString(), add(), and remove() test");
        test2.add(2,"stuff");
        System.out.println(test2.toString());   //[dog,dog,stuff,cat,meow]
        System.out.println(test2.size());       //5
        test2.remove(2);
        System.out.println(test2.toString());   //[dog, dog, cat, meow]
        System.out.println(test2.size());   //4
        //


        // indexOf() and toArray() test
        System.out.println("indexOf() and toArray() test");
        System.out.println(test2.indexOf("3"));     // -1
        System.out.println(test2.indexOf("dog"));   // 0
        System.out.println(Arrays.toString(test2.toArray()));
        //

        //HW 16 TESTS

        /*
        SuperArray words = new SuperArray();
        //grouped to save vertical space
        words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
        words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
        words.add("una");    words.add("ebi");     words.add("toro");
        System.out.println(words);
        SuperArray.removeDuplicates(words);
        System.out.println(words);
        */

        /*
        SuperArray test3 = new SuperArray();
        test3.add("0");
        test3.add("4");
        test3.add("5");
        test3.add("9");
        SuperArray test4 = new SuperArray();
        test4.add("9");
        test4.add("9");
        test4.add("9");
        test4.add("9");
        System.out.println(SuperArray.findOverlap(test3, test4));
        System.out.println(test4.lastIndexOf("8"));
        */

        //This is my friend Steven Lei's Tester
    }

}
