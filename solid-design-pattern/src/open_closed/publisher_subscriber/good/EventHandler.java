package open_closed.publisher_subscriber.good;

import open_closed.publisher_subscriber.common.Event;

import java.util.List;

public class EventHandler {
  private final List<Subscriber> subscriberList;

  public EventHandler(List<Subscriber> subscriberList) {
    this.subscriberList = subscriberList;
  }

  public void handle(final Event event){
    for(Subscriber subscriber : subscriberList){
      subscriber.handle(event);
    }
  }
}
