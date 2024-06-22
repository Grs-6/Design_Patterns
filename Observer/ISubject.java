//subject interface
public interface ISubject {
    void subscribe(ISubscriber subscriber);
    void unsubscribe(ISubscriber subscriber);
    void notifySubscribers(String videoTitle);
}
