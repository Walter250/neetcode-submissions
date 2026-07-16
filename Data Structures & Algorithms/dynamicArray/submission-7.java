class DynamicArray {
    private int[] myArray;
    private int size = 0;

    public DynamicArray(int capacity) {
        myArray = new int[Math.max(capacity, 1)];
    }

    public int get(int i) {
        if (i >= 0 && i < size)
            return myArray[i];
        return 0;
    }

    public void set(int i, int n) {
        if (i >= 0 && i < size) {
            myArray[i] = n;
        }
    }

    public void pushback(int n) {
        if (size == myArray.length)
            resize();
        myArray[size] = n;
        size++;
    }

    public int popback() {
        if (size > 0) {
            size--;
            int val = myArray[size];
            return val;
        }
        return 0;
    }

    private void resize() {
        myArray = Arrays.copyOf(myArray, myArray.length * 2);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return myArray.length;
    }
}