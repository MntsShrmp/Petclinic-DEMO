
package javax.cache.processor;

import javax.cache.Cache;

public interface MutableEntry<K, V> extends Cache.Entry<K, V> {

  
  boolean exists();

  
  void remove();

  
  V getValue();

  
  void setValue(V value);
}
