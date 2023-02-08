package open_closed.publisher_subscriber.bad;

import open_closed.publisher_subscriber.common.Event;

public class EventHandler {
  private AnalyticsSubscriber analyticsSubscriber;
  private LogsSubscriber logsSubscriber;

  public void handleEvent(Event event){
    analyticsSubscriber.handle();
    logsSubscriber.handle();
    /* If we want to add any new event we will be required modifying the code.. */
  }
}
