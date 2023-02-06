package open_closed.notification_service.good;

import open_closed.notification_service.common.Notification;
import open_closed.notification_service.common.SmsNotificationProvider;

public class SmsNotificationService implements NotificationService {
  private SmsNotificationProvider smsNotificationProvider;
  @Override
  public void sendNotification(Notification notification) {
    smsNotificationProvider.sendNotification(notification);
  }
}
