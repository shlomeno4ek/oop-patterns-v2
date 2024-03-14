package patterns.behavioral.pubsub.task.pubsub;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
  Video channel's subscriber.
 */
public class Subscriber implements Observable{
    private final String nickname;
    private boolean isLikeVideo;
    private final List channelAdministrators;

    public Subscriber(String nickname) {
        this.nickname = nickname;
        this.isLikeVideo = false;
        this.channelAdministrators = new ArrayList<>();
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isLikeVideo() {
        return isLikeVideo;
    }

    public void setLikeVideo(boolean likeVideo) {
        isLikeVideo = likeVideo;
    }

    @Override
    public void process(Video video) {
        Random random = new Random(100);
        if (video.getDuration() < random.nextInt()) {
            System.out.println(nickname + ": I like this short video!");
        } else {
            System.out.println(nickname +  ": I dislike this long video!");
        }
    }
}
