public class SuperArray {
    private String [] data;
    private int size; //The current size

    public SuperArray() {
        data = new String[10];
        size = 0;
    }

    public SuperArray(int initialCapacity) {
        data = new String[initialCapacity];
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

    public void add(int index, String element) {
        if (size == data.length) resize();
        for(int i=size-1;i>=index;i--){
            data[i+1] = data[i];
        }
        data[index] = element;
        size++;
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
            if (i == size - 1) array += String.valueOf(data[i]) + "]";
            else array += String.valueOf(data[i]) + ", ";
        }
        return array;
    }

    public boolean contains(String s) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(s)) return true;
        }
        return false;
    }

    public String remove(int index) {
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
        for (int i = 0; i < data.length; i++) {
            array[i] = data[i];
        }
        return array;
    }

}
