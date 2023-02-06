package open_closed.notification_service.good;

import open_closed.notification_service.common.Notification;

public class NotificationServiceManager {
  private NotificationProviderFactory notificationProviderFactory;
  public void sendNotification(final Notification notification){
    notificationProviderFactory.getNotificationProvider(notification.getMode()).sendNotification(notification);
  }
}
