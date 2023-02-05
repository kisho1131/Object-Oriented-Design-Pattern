package open_closed.notification_service.bad;

import open_closed.notification_service.common.EmailNotification;
import open_closed.notification_service.common.Notification;
import open_closed.notification_service.common.NotificationType;
import open_closed.notification_service.common.SmsNotification;

public class NotificationService {
  private EmailNotification emailNotification;
  private SmsNotification smsNotification;

  void sendNotification(final Notification notification) {
    if (notification.getMode() == NotificationType.SMS) {
      smsNotification.sendNotification();
    } else if (notification.getMode() == NotificationType.EMAIL) {
      emailNotification.sendNotification();
    }
  }
}
