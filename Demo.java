public class Demo{
  public static void removeDuplicates(SuperArray s){
      for (int i = 0; i < s.size(); i++) {
          String test = s.get(i);
          for (int j = s.size()-1; j > i; j--) {
              if (test.equals(s.get(j))) s.remove(j);
          }
      }
   }

   public static SuperArray findOverlap(SuperArray a, SuperArray b){
       SuperArray arr = new SuperArray();
       for (int i = 0; i < a.size(); i++) {
           String valueA = a.get(i);
           for (int j = 0; j < b.size(); j++) {
               if (valueA.equals(b.get(j))) arr.add(valueA);
           }
       }
       removeDuplicates(arr);
       return arr;
   }

   public static SuperArray zip (SuperArray a, SuperArray b){
        SuperArray arr = new SuperArray(a.size()+b.size());
        int min = Math.min(a.size(), b.size());
        for (int i = 0; i< min;i++){
            arr.add(a.get(i));
            arr.add(b.get(i));
        }
        if (a.size() == min){
            for (int i = min; i < (b.size());i++){
                arr.add(b.get(i));
            }
        }
        if (b.size() == min){
            for (int i = min; i < (a.size());i++){
                arr.add(a.get(i));
            }
        }
        return arr;
    }


  public static void main(String[]args){
    SuperArray words = new SuperArray();
    SuperArray arr1 =  new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    arr1.add("kani");   arr1.add("uni"); arr1.add("happy");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    System.out.println(findOverlap(arr1,words));
}
}
