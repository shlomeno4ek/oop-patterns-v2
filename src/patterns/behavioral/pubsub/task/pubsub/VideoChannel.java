package patterns.behavioral.pubsub.task.pubsub;

import java.util.ArrayList;
import java.util.List;

/**
  Description object of video channel(model).
 */
public class VideoChannel implements Publisher{
    private final List<Observable> subscribers;
    private final List<Video> videos;
    private ChannelAdmin admin;

    public VideoChannel() {
        this(new ChannelAdmin("Rob"));
    }

    public VideoChannel(ChannelAdmin admin) {
        this.subscribers = new ArrayList<>();
        this.videos = new ArrayList<>();
        this.admin = admin;
    }

    public void addVideo(Video video) {
        videos.add(video);
        notifySubscribers(video);

    }

    public ChannelAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(ChannelAdmin admin) {
        this.admin = admin;
    }

    @Override
    public void registerSubscriber(Observable observable) {
        subscribers.add(observable);
    }

    @Override
    public void deleteSubscriber(Observable observable) {
        subscribers.remove(observable);
    }

    @Override
    public void notifySubscribers(Video video) {
        for (Observable observable: subscribers) {
            observable.process(video);
        }
    }
}
