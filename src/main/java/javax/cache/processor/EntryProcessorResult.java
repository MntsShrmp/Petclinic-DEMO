
package javax.cache.processor;


public interface EntryProcessorResult<T> {
  
  T get() throws EntryProcessorException;
}
