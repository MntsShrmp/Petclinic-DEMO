package javax.cache.configuration;

import java.io.Serializable;

public interface Configuration<K, V> extends Serializable {

  Class<K> getKeyType();
  
  Class<V> getValueType();
  
  boolean isStoreByValue();
}
