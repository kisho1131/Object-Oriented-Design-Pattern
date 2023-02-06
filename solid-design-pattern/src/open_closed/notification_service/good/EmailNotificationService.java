package open_closed.notification_service.good;

import open_closed.notification_service.common.Notification;

public class EmailNotificationService implements NotificationService {
  private EmailNotificationService emailNotificationService;
  @Override
  public void sendNotification(Notification notification) {
    emailNotificationService.sendNotification(notification);
  }
}
