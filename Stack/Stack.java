package Stack;

public class Stack<E> {
    private Object[] data;
    private int size;

    public Stack() {
        size = 0;
        data = new Object[10];
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            System.out.print("\t");

        }
        System.out.println("");
    }

    public E push(E value) {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size] = value;
        size++;
        return value;
    }

    public E pop() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                var helper = data[i - 1];
                data[i - 1] = null;
                size--;
                return (E) helper;
            }
        }
        return null;
    }

    public E peek() {
        return (E) data[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int search(Object o) {
        int find = -1;
        int helper = 0;

        for (int i = 0; i < data.length; i++) {
            if (o.equals(data[i])) {
                find = 0;
                helper = i;
            }

        }
        if (find == 0) {
            return size - helper - 2;
        }
        return find;

    }
}