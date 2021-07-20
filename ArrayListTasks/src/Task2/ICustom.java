package Task2;

public interface ICustom<T> extends Iterable<T> {
    boolean add(T e);
    void delete(int index) throws InvalidOperationException;
    T get(int index);
    int size();
    void update(int index, T e) throws InvalidOperationException;
}
