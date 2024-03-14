package patterns.behavioral.pubsub.task.pubsub;

public interface Publisher {
    void registerSubscriber(Observable observer);
    void deleteSubscriber(Observable observable);
    void notifySubscribers(Video video);
}
