package edu.mum.cs.cs525.labs.skeleton.observer;

import edu.mum.cs.cs525.labs.skeleton.constant.NotificationType;

public class LogNotificationObserver implements NotificationObserver {
    private LogNotificationObserver(){}
    public static LogNotificationObserver instance;

    public static LogNotificationObserver getNotificationObserver(){
        if(instance == null){
            instance = new LogNotificationObserver();
        }
        return instance;
    }
    @Override
    public void update(NotificationType notificationType, String message) {
        System.out.println("LOG:: "+ message);
    }
}
