class Tester{
  public static void main(String[] args) {
    String[] randomStuff = new String[] {"linus", "tech", "tips", "austin", "evans", "jon", "morrison", "Dave", "Lee", "Bitwit"};
    String[] linusRaid = new String[] {"linus", "tech", "tips"};
    SuperArray M1 = new SuperArray();

    System.out.print("This test tests add().");
    for (int i = 0; i < 10; i++){
      M1.add(randomStuff[i]);
    }
    System.out.print("\nThis test tests get()\nExpected output: \n{linus, tech, tips, austin, evans, jon, morrison, Dave, Lee, Bitwit}\nActual output: \n{");
    for (int i = 0; i < 10; i++){
      System.out.print(M1.get(i));
      if (i < 9){
        System.out.print(", ");
      }
    }
    System.out.print("}\nThis test tests set().");
    for (int i = 0; i < 10; i++){
      M1.set(i, linusRaid[i%3]);
    }
    System.out.print("\nThis test tests get(). Expected result:\n{linus, tech, tips, linus, tech, tips, linus, tech, tips, linus}.\nActual output: \n{");
    for (int i = 0; i < 10; i++){
      System.out.print(M1.get(i));
      if (i < 9){
        System.out.print(", ");
      }
    }
    System.out.print("}\nThis test tests set().");
    for (int i = 10; i < 20; i++){
      M1.add(randomStuff[i-10]);
    }
    System.out.print("\nThis test tests get(). Expected result:\n{linus, tech, tips, linus, tech, tips, linus, tech, tips, linus, linus, tech, tips, austin, evans, jon, morrison, Dave, Lee, Bitwit}.\nActual output: \n{");
    for (int i = 0; i < 20; i++){
      System.out.print(M1.get(i));
      if (i < 19){
        System.out.print(", ");
      }
    }
    System.out.print("}\n");
  }
}
