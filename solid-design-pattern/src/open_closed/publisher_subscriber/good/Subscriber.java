package open_closed.publisher_subscriber.good;

import open_closed.publisher_subscriber.common.Event;

public interface Subscriber {
  void handle(Event event);
}
