package HomeWork2;

import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] arr = new int[10];
    private int size = 0;

    @Override
    public boolean add(int element) {
        if (size >= arr.length) {
            int newSize = arr.length * 3 / 2 + 1;
            int[] newArr = new int[newSize];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size] = element;
        size++;
        return false;
    }

    @Override
    public boolean add(int index, int element) {
        int[] tmpArr = new int[arr.length];
        for (int i = 0; i <= size; i++) {
            if (i < index) {
                tmpArr[i] = arr[i];
            } else if (i == index) {
                tmpArr[i] = element;
            } else {
                tmpArr[i] = arr[i - 1];
            }
        }
        arr = tmpArr;
        size++;
        return false;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(int index) {
        int[] tmpArr = new int[arr.length];
        for (int i = 0; i < size - 1; i++) {
            if (i < index) {
                tmpArr[i] = arr[i];
            } else {
                tmpArr[i] = arr[i + 1];
            }
        }
        arr = tmpArr;
        size--;
        return false;
    }

    @Override
    public boolean removeByValue(int value) {
        for (int i = 0; i <= size; i++) {
            if (arr[i] == value) {
                System.arraycopy(arr, i + 1, arr, i, size - i - 1);
            }
        }
        size--;
        return false;
    }

    @Override
    public boolean set(int index, int element) {
        if (index >= 0 && index < size) {
            arr[index] = element;
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public String toString() {
        return Arrays.toString(toArray());
    }
}
