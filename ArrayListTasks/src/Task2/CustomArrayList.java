package Task2;

import java.util.Iterator;

public class CustomArrayList<T> implements ICustom<T> {
    private T[] values;

    public CustomArrayList() {
        values = (T[]) new Object[0];
    }

    public boolean add(T e) {
        try{
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;

        }catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public void delete(int index) throws InvalidOperationException{
        throw new InvalidOperationException("Item cannot be deleted");
    }

    public T get(int index) {
        return values[index];
    }

    public int size() {
        return values.length;
    }

    public void update(int index, T e) throws InvalidOperationException{
        throw new InvalidOperationException("Item cannot be updated");
    }

    public Iterator<T> iterator() {
        return new ArrayIterator<T>(values);
    }
}
