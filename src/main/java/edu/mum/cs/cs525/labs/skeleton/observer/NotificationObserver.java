package edu.mum.cs.cs525.labs.skeleton.observer;

import edu.mum.cs.cs525.labs.skeleton.constant.NotificationType;

public interface NotificationObserver {
    void update(NotificationType notificationType, String message);
}
