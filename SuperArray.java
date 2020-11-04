public class SuperArray {
    private String [] data;
    private int size; //The current size

    public SuperArray() {
        data = new String[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public String get(int index) {
        return data[index];
    }

    private void resize() {
        String[] arr = new String[2*size];
        for (int i = 0; i < data.length; i++) {
            arr[i] = data[i];
        }
        data = arr;
    }

    public boolean add(String element) {
        if (size == data.length) resize();
        data[size] = element;
        size++;
        return true;
    }

    public String set(int index, String element) {
        String replace = data[index];
        data[index] = element;
        return replace;
    }

    public boolean isEmpty(){
        return(size==0);
    }

    public void clear(){
        size = 0;
    }

    public String toString(){
        String array = "[";
        if (size == 0) array = "[]";
        for (int i = 0; i < size; i++) {
            array += String.valueOf(data[i]) + ", ";
        }
        array += ("]");
        return array;
    }

    // public boolean contains(String s) {
    //     s = data.toString();
    //     for (int i = 0; i < s.length(); i++) {
    //         if
    //     }
    // }






}
