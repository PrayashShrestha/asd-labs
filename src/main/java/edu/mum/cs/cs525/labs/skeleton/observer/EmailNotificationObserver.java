package edu.mum.cs.cs525.labs.skeleton.observer;


import edu.mum.cs.cs525.labs.skeleton.constant.NotificationType;

public class EmailNotificationObserver implements NotificationObserver {
    private EmailNotificationObserver(){}

    private static EmailNotificationObserver instance;
    public static EmailNotificationObserver getEmailNotificationObserver(){
        if(instance == null){
            instance = new EmailNotificationObserver();
        }
        return instance;
    }

    @Override
    public void update(NotificationType notificationType, String message) {
        if(notificationType == NotificationType.CREATED){
            System.out.println("EMAIL :: "+message);
        }
    }
}
