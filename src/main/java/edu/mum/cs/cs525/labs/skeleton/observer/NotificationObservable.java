package edu.mum.cs.cs525.labs.skeleton.observer;

import edu.mum.cs.cs525.labs.skeleton.constant.NotificationType;

public interface NotificationObservable {
    void registerObserver(NotificationObserver notificationObserver);
    void removeObserver(NotificationObserver notificationObserver);
    void notifyObservers(NotificationType notificationType , String message);
}
