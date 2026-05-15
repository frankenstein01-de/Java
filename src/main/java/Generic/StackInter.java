package Generic;

public interface StackInter<T> {
    void push(T element);
    T pop();
    int size();
}
