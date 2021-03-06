package javax.cache;

import javax.cache.configuration.CacheEntryListenerConfiguration;
import javax.cache.configuration.Configuration;
import javax.cache.integration.CompletionListener;
import javax.cache.processor.EntryProcessor;
import javax.cache.processor.EntryProcessorException;
import javax.cache.processor.EntryProcessorResult;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public interface Cache<K, V> extends Iterable<Cache.Entry<K, V>>, Closeable {

    V get(K key);

    
    Map<K, V> getAll(Set<? extends K> keys);

    
    boolean containsKey(K key);

    
    void loadAll(Set<? extends K> keys, boolean replaceExistingValues,
                 CompletionListener completionListener);

    
    void put(K key, V value);

    
    V getAndPut(K key, V value);

    
    void putAll(java.util.Map<? extends K, ? extends V> map);

    
    boolean putIfAbsent(K key, V value);

    
    boolean remove(K key);

    
    boolean remove(K key, V oldValue);

    
    V getAndRemove(K key);

    
    boolean replace(K key, V oldValue, V newValue);

    
    boolean replace(K key, V value);

    
    V getAndReplace(K key, V value);

    
    void removeAll(Set<? extends K> keys);

    
    void removeAll();

    
    void clear();

    
    <C extends Configuration<K, V>> C getConfiguration(Class<C> clazz);

    
    <T> T invoke(K key,
                 EntryProcessor<K, V, T> entryProcessor,
                 Object... arguments) throws EntryProcessorException;

    
    <T> Map<K, EntryProcessorResult<T>> invokeAll(Set<? extends K> keys,
                                                  EntryProcessor<K, V, T>
                                                          entryProcessor,
                                                  Object... arguments);

    
    String getName();

    
    CacheManager getCacheManager();

    
    void close();

    
    boolean isClosed();

    
    <T> T unwrap(java.lang.Class<T> clazz);

    
    void registerCacheEntryListener(
            CacheEntryListenerConfiguration<K, V> cacheEntryListenerConfiguration);

    
    void deregisterCacheEntryListener(CacheEntryListenerConfiguration<K, V>
                                              cacheEntryListenerConfiguration);

    
    Iterator<Cache.Entry<K, V>> iterator();

    
    interface Entry<K, V> {

        
        K getKey();

        
        V getValue();

        
        <T> T unwrap(Class<T> clazz);
    }
}
