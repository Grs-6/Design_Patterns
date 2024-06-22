public class YouTubeApp {
    public static void main(String[] args) {
        YouTubeChannel techChannel = new YouTubeChannel("TechSavvy");
        YouTubeChannel techChannel2 = new YouTubeChannel("TEDx");


        ISubscriber subscriber1 = new YouTubeSubscriber("Alice");
        ISubscriber subscriber2 = new YouTubeSubscriber("Bob");

        techChannel.subscribe(subscriber1);
        techChannel.subscribe(subscriber2);

        techChannel.uploadVideo("Observer Pattern Tutorial");
        techChannel.uploadVideo("Factory Pattern Tutorial");

        techChannel.unsubscribe(subscriber1);
        techChannel2.subscribe(subscriber1);

        techChannel2.uploadVideo("How to Think Fast");
    }
}
