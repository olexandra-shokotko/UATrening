package Task2Version2;

import java.util.ArrayList;
import java.util.Collection;

public class OwnArrayList<T> extends ArrayList<T> {
    @Deprecated
    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException("Operation could not be performed");
    }

    @Deprecated
    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException("Operation could not be performed");
    }

    @Deprecated
    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Operation could not be performed");
    }

    @Deprecated
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation could not be performed");
    }

    @Deprecated
    @Override
    public void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Operation could not be performed");
    }

    @Deprecated
    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Operation could not be performed");
    }

}
