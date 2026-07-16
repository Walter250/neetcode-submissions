class DynamicArray {
     Integer [] myArray;

    public DynamicArray(int capacity) {
        if(capacity>0)
        {
            myArray = new Integer [capacity];
        }

    }

    public int get(int i) {
        if(i>=0 && i<myArray.length)
        {
            if (myArray[i] != null)
                return myArray[i];
        }
        return 0;

    }

    public void set(int i, int n) {
        if(i>=0 && i<myArray.length)
        {
            myArray[i] = n;
        }

    }

    public void pushback(int n) {
        if((getSize() ==  getCapacity()))
            resize();

        myArray[getSize()] = n;

    }

    public int popback() {
    if (getSize() > 0) {
        int lastIndex = getSize() - 1;
        int pop = myArray[lastIndex];
        myArray[lastIndex] = null;
        return pop;
    }
    return 0;
}

    private void resize() {
        myArray = Arrays.copyOf(myArray, myArray.length * 2);

    }

    public int getSize() {
        int size = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != null)
                size++;
        }
        return size;

    }

    public int getCapacity() {
        return myArray.length;

    }
}
