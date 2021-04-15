
package javax.cache.event;

import javax.cache.Cache;
import java.util.EventObject;


public abstract class CacheEntryEvent<K, V> extends EventObject
    implements Cache.Entry<K, V> {

  private EventType eventType;

  
  public CacheEntryEvent(Cache source, EventType eventType) {
    super(source);
    this.eventType = eventType;
  }

  
  @Override
  public final Cache getSource() {
    return (Cache) super.getSource();
  }

  
  @Override
  public abstract V getValue();

  
  public abstract V getOldValue();

  
  public abstract boolean isOldValueAvailable();

  
  public final EventType getEventType() {
    return eventType;
  }
}
