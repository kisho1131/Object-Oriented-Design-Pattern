package open_closed.notification_service.bad;

import open_closed.notification_service.common.EmailNotificationProvider;
import open_closed.notification_service.common.Notification;
import open_closed.notification_service.common.NotificationType;
import open_closed.notification_service.common.SmsNotificationProvider;

public class NotificationService {
  private EmailNotificationProvider emailNotificationProvider;
  private SmsNotificationProvider smsNotificationProvider;

  void sendNotification(final Notification notification) {
    if (notification.getMode() == NotificationType.SMS) {
      smsNotificationProvider.sendNotification(notification);
    } else if (notification.getMode() == NotificationType.EMAIL) {
      emailNotificationProvider.sendNotification(notification);
    }
  }
}
