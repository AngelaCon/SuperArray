import java.util.Arrays;
public class Tester {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("removeDuplicates() test");
        SuperArray dupTest = new SuperArray(); // Test order
        dupTest.add("2");     dupTest.add("1");    dupTest.add("3");
        dupTest.add("1");     dupTest.add("2");    dupTest.add("3");
        System.out.println(dupTest.toString() + " ~ should print [2, 1, 3, 1, 2, 3]");
        Demo.removeDuplicates(dupTest);
        System.out.println(dupTest.toString() + " ~ should print [2, 1, 3]");
        SuperArray dupTest2 = new SuperArray();
        Demo.removeDuplicates(dupTest2);
        System.out.println(dupTest2.toString() + " ~ should print []");
        dupTest2.add("1");
        Demo.removeDuplicates(dupTest2);
        System.out.println(dupTest2.toString() + " ~ should print [1]");
        //

        // findOverlap() test
        System.out.println();
        System.out.println("findOverlap() test");
        SuperArray foTest1 = new SuperArray();
        foTest1.add("1");   foTest1.add("2");   foTest1.add("5");
        foTest1.add("4");   foTest1.add("6");   foTest1.add("3");
        SuperArray foTest2 = new SuperArray();
        foTest2.add("5");   foTest2.add("3");   foTest2.add("2");
        foTest2.add("3");   foTest2.add("9");   foTest2.add("110");
        System.out.println(Demo.findOverlap(foTest1, foTest2).toString() + " ~ should print [2, 5, 3]");
        //[2,5,3]
        foTest1.clear();
        foTest2.clear();

        foTest1.add("3");   foTest1.add("6");   foTest1.add("5");
        foTest1.add("9");   foTest1.add("3");   foTest1.add("2");

        foTest2.add("1");   foTest2.add("2");   foTest2.add("3");
        foTest2.add("4");   foTest2.add("5");   foTest2.add("6");
        System.out.println(Demo.findOverlap(foTest1, foTest2).toString() + " ~ should print [3, 6, 5, 2]");
        //[3,6,5,2]  <- Note the difference, should be in order of the first SuperArray parameter
        System.out.println(Demo.findOverlap(foTest2, foTest1).toString() + " ~ should print [2, 3, 5, 6]");
        //[2,3,5,6]
        //

        // lastIndexOf() and equals() test
        System.out.println();
        System.out.println("lastIndexOf() and equals() test");
        SuperArray lTest = new SuperArray();
        lTest.add("foo");   lTest.add("dude");   lTest.add("foo");
        lTest.add("foo");   lTest.add("dude");   lTest.add("foo");
        lTest.add("foo");   lTest.add("dude");   lTest.add("foo");
        System.out.println(lTest.lastIndexOf("foo") + " ~ should print 8");
        // 8
        System.out.println(lTest.lastIndexOf("dude") + " ~ should print 7");
        // 7
        SuperArray lTest2 = new SuperArray();
        lTest2.add("foo");   lTest2.add("dude");   lTest2.add("foo");
        lTest2.add("foo");   lTest2.add("dude");   lTest2.add("foo");
        lTest2.add("foo");   lTest2.add("dude");   lTest2.add("foo");

        System.out.println(lTest.equals(lTest2) + " ~ should print true");
        // true
        // Testing when this.size() > other.size()
        lTest2.remove(8);
        System.out.println(lTest.equals(lTest2) + " ~ should print false");
        // false
        // Testing when this.size() < other.size()
        lTest.remove(8); lTest.remove(7);
        System.out.println(lTest.equals(lTest2) + " ~ should print false");
        // false
        // testing when this and other don't have same content.
        lTest.add("err");
        System.out.println(lTest.equals(lTest2) + " ~ should print false");
        // false
        // testing when this and other have same content but different order.
        lTest.clear();
        lTest.add("dude");   lTest.add("foo");   lTest.add("foo");
        lTest.add("dude");   lTest.add("foo");   lTest.add("foo");
        lTest.add("dude");   lTest.add("foo");
        System.out.println(lTest.equals(lTest2) + " ~ should print false");
        //false
        System.out.println(lTest2.equals(lTest) + " ~ should print false");

        //false
        //

        System.out.println();
        System.out.println("zip() test");
        SuperArray words = new SuperArray();
        words.add("one");   words.add("two");   words.add("three");
        words.add("four");  words.add("five");  words.add("six");
        SuperArray numbers = new SuperArray();
        numbers.add("1");   numbers.add("2");   numbers.add("3");
        numbers.add("4");   numbers.add("5");   numbers.add("6");
        System.out.println(Demo.zip(words,numbers).toString());
        System.out.println("[one, 1, two, 2, three, 3, four, 4, five, 5, six, 6] (expected)");
        // change to words.size() < numbers.size()
        words.remove(5);
        System.out.println(Demo.zip(words,numbers).toString());
        System.out.println("[one, 1, two, 2, three, 3, four, 4, five, 5, 6] (expected)");
        // change to words.size() > numbers.size()
        numbers.remove(5);
        numbers.remove(4);
        System.out.println(Demo.zip(words,numbers));
        System.out.println("[one, 1, two, 2, three, 3, four, 4, five] (expected)");
        }

        // this is Steven Lei's Tester
    }
