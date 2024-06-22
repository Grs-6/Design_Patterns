public interface IAggregate<T> {
    IIterator<T> createIterator();
}

