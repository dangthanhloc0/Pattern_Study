package obServer.iImpl;

import obServer.interfaceEx.Observer;
import obServer.interfaceEx.Subject;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Business logic
    public void uploadVideo(String title) {
        System.out.println("Channel uploaded: " + title);
        notifyObservers("New video: " + title);
    }
}

