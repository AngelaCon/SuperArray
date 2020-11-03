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
            data[i] = arr[i];
        }
        data = arr;
    }

    public boolean add(String element) {
        if (size == data.length) resize();
        size += 1;
        data[size+1] = element;
        return true;
    }

    public String set(int index, String element) {
        String replaced = data[index];
        data[index] = element;
        return replaced;
    }



}
