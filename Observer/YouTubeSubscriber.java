//concrete observer

public class YouTubeSubscriber implements ISubscriber {
    private String name;

    public YouTubeSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("Hey " + name + ", " + channelName + " has uploaded a new video: " + videoTitle+"\n");
    }
}
