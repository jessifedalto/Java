package ArrayList.Classes;

import ArrayList.Classes.MyStringComparer;

public class ArrayList<T> // array generico
{
    private int count;
    private Object[] arr;

    public ArrayList() {
        count = 0;
        arr = new Object[10];
    }

    public void add(T value) {
        if (count == arr.length) {
            Object[] newArr = new Object[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
                // arr = newArr;
            }
            return;
        }

    }

    public int size() {
        return count;
    }

    public void set(int index, T value) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        arr[index] = value;
    }

    public ArrayList<T> clone() {
        ArrayList<T> copy = new ArrayList<T>();

        copy.count = this.count;
        copy.arr = this.arr;

        return copy;
    }

    public void sort(Comparator<T> cmp) {
        Object[] temp = new Object[count];
        mergeSort(cmp, arr, temp, 0, count);
    }

    private void mergeSort(
            Comparator<T> cmp,
            Object[] arr,
            Object[] temp,
            int start,
            int end) {
        if (end - start < 2)
            return;
        int middle = (start + end) / 2;
        mergeSort(cmp, arr, temp, start, middle);
        mergeSort(cmp, arr, temp, middle, end);
        merge(cmp, arr, temp, start, middle, end);
    }

    private void merge(
            Comparator<T> cmp,
            Object[] arr,
            Object[] temp,
            int start,
            int middle,
            int end) {
        int i = start, j = middle, k = start;
        while (i < middle && j < end) {
            var result = cmp.compare((T) arr[i], (T) arr[j]);
            if (result < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < middle)
            temp[k++] = arr[i++];

        while (j < end) {
            temp[k++] = arr[j++];
        }

        for (int x = start; x < end; x++)
            arr[x] = temp[x];
    }

}