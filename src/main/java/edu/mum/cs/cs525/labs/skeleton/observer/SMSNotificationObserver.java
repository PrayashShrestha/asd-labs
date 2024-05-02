package edu.mum.cs.cs525.labs.skeleton.observer;

import edu.mum.cs.cs525.labs.skeleton.constant.NotificationType;

public class SMSNotificationObserver implements NotificationObserver {
    private SMSNotificationObserver(){}

    public static SMSNotificationObserver instance;

    public static SMSNotificationObserver getSMSNotificationObserver(){
        if(instance == null){
            instance = new SMSNotificationObserver();
        }
        return instance;
    }

    @Override
    public void update(NotificationType notificationType, String message) {
        System.out.println("SMS:: " +message);
    }
}
