package Task2;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private int index = 0;
    private T[] values;

    public ArrayIterator(T[] values) {
        this.values = values;
    }

    public boolean hasNext() {
        return index < values.length;
    }

    public T next() {
        return values[index++];
    }
}
