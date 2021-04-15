
package javax.cache.event;


public interface CacheEntryEventFilter<K, V> {

  
  boolean evaluate(CacheEntryEvent<? extends K, ? extends V> event)
      throws CacheEntryListenerException;
}
