public class FrontMiddleBackQueue {
    //https://leetcode.com/problems/design-front-middle-back-queue/
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public FrontMiddleBackQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public void pushFront(int val) {
        if (isFull()) {
            resize();
        }
        for (int i = size; i > 0; i--) {
            data[i] = data[i - 1];
        }
        data[0] = val;
        size++;
    }

    public void pushMiddle(int val) {
        if (isFull()) {
            resize();
        }
        int mid = size / 2;
        for (int i = size; i > mid; i--) {
            data[i] = data[i - 1];
        }
        data[mid] = val;
        size++;
    }

    public void pushBack(int val) {
        if (isFull()) {
            resize();
        }
        data[size] = val;
        size++;
    }

    public int popFront() {
        if (isEmpty()) {
            return -1;
        }
        int returned = data[0];
        for (int i = 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return returned;
    }

    public int popMiddle() {
        if (isEmpty()) {
            return -1;
        }
        int mid = (size - 1) / 2;
        int returned = data[mid];
        for (int i = mid; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return returned;
    }

    public int popBack() {
        if (isEmpty()) {
            return -1;
        }
        int returned = data[size - 1];
        size--;
        return returned;
    }
}
