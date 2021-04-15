
package javax.cache.processor;



public interface EntryProcessor<K, V, T> {

  
  T process(MutableEntry<K, V> entry, Object... arguments)
      throws EntryProcessorException;
}
