package open_closed.notification_service.common;

public class Notification {
  private NotificationType mode;
  private String message;

  public NotificationType getMode() {
    return mode;
  }

  public void setMode(NotificationType mode) {
    this.mode = mode;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
