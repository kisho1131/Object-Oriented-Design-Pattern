package open_closed.publisher_subscriber.good;

import open_closed.publisher_subscriber.common.Event;

public class AnalyticsEventSubscriber implements Subscriber{
  @Override
  public void handle(Event event) {
    System.out.println("Handle Event for Analytics !! ");
  }
}
