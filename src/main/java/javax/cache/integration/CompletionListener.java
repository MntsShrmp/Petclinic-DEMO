
package javax.cache.integration;


public interface CompletionListener {

  
  void onCompletion();

  
  void onException(Exception e);
}
