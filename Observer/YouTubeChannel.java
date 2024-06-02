//concrete subject
import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private List<Subscriber> subscribers;
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.subscribers = new ArrayList<>();
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(channelName, videoTitle);
        }
    }

    public void uploadVideo(String videoTitle) {
        System.out.println("Uploading video: " + videoTitle + " on channel: " + channelName+"\n");
        notifySubscribers(videoTitle);
    }
}
