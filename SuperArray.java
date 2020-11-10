public class SuperArray {
    private String [] data;
    private int size; //The current size

    public SuperArray() {
        data = new String[10];
        size = 0;
    }

    public SuperArray(int initialCapacity) {

        if (initialCapacity < 0) {
            throw new IllegalArgumentException("You can't have negative capacity, dum dum");
        }
        data = new String[initialCapacity];
        size = 0;
    }


    public int size() {
        return size;
    }

    public String get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Your index is positively wrong");
        }
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

    public void add(int index, String element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Your index is positively wrong");
        }
        if (size == data.length) resize();
        for(int i=size-1;i>=index;i--){
            data[i+1] = data[i];
        }
        data[index] = element;
        size++;
    }


    public String set(int index, String element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Your index is positively wrong");
        }
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
            if (i == size - 1) array += String.valueOf(data[i]) + "]";
            else array += String.valueOf(data[i]) + ", ";
        }
        return array;
    }

    public boolean contains(String s) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(s)) return true;
        }
        return false;
    }

    public String remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Your index is positively wrong");
        }
        for (int i = index; i < size-1; i++) {
            data[i]= data[i+1];
        }
        String removed = data[index];
        size--;
        return removed;
    }

    public int indexOf(String s) {
        boolean found = false;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (found == false && data[i].equals(s)) {
                found = true;
                index = i;
            }
        }
        return index;
    }

    public String[] toArray() {
        String array[]= new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = data[i];
        }
        return array;
    }


    public int lastIndexOf(String value){
        boolean found = false;
        int index = -1;
        for (int i = size-1; i >= 0; i--) {
            if (data[i].equals(value) && found == false) {
                found = true;
                index = i;
            }
        }
        return index;
    }

    public boolean equals(SuperArray other){
        boolean same = true;
        if (this.size() == other.size()) {
            for (int i = 0; i < other.size(); i++) {
                if (!(this.get(i).equals(other.get(i)))) {
                    same = false;
                }
            }
        }
        else same = false;
        return same;
    }



}
