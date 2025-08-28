package interator_pattern.interfaceEx;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
