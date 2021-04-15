
package javax.cache.configuration;

import javax.cache.event.CacheEntryEventFilter;
import javax.cache.event.CacheEntryListener;
import java.io.Serializable;


public interface CacheEntryListenerConfiguration<K, V> extends Serializable {
  
  Factory<CacheEntryListener<? super K, ? super V>> getCacheEntryListenerFactory();

  
  boolean isOldValueRequired();

  
  Factory<CacheEntryEventFilter<? super K, ? super V>>
  getCacheEntryEventFilterFactory();

  
  boolean isSynchronous();
}
