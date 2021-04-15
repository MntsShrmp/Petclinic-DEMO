
package javax.cache.configuration;

import java.io.Serializable;


public interface Factory<T> extends Serializable {

  
  T create();
}
