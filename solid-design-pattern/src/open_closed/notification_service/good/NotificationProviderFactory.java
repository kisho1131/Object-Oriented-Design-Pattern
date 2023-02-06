package open_closed.notification_service.good;

import open_closed.notification_service.common.NotificationType;

import java.util.Map;

public class NotificationProviderFactory {
  private final Map<NotificationType, NotificationService> provider;
  public NotificationProviderFactory(Map<NotificationType, NotificationService> provider) {
    this.provider = provider;
  }
  public NotificationService getNotificationProvider(final NotificationType notificationType){
    return provider.get(notificationType);
  }
}
