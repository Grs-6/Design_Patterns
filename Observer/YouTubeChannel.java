//concrete subject
import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements ISubject {
    private List<ISubscriber> subscribers;
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.subscribers = new ArrayList<>();
        this.channelName = channelName;
    }

    @Override
    public void subscribe(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for (ISubscriber subscriber : subscribers) {
            try {
                subscriber.update(channelName, videoTitle);
            } catch (Exception e) {
                System.err.println("Failed to notify subscriber: " + subscriber + " due to an error: " + e.getMessage());
            }
        }
    }

    public void uploadVideo(String videoTitle) {
        System.out.println("Uploading video: " + videoTitle + " on channel: " + channelName+"\n");
        notifySubscribers(videoTitle);
    }
}
