package javax.cache.spi;

import javax.cache.CacheManager;
import javax.cache.configuration.OptionalFeature;
import java.io.Closeable;
import java.net.URI;
import java.util.Properties;

public interface CachingProvider extends Closeable {

  CacheManager getCacheManager(URI uri, ClassLoader classLoader,
                               Properties properties);

  ClassLoader getDefaultClassLoader();

  URI getDefaultURI();

  Properties getDefaultProperties();

  CacheManager getCacheManager(URI uri, ClassLoader classLoader);

  CacheManager getCacheManager();

  void close();

  void close(ClassLoader classLoader);

  void close(URI uri, ClassLoader classLoader);

  boolean isSupported(OptionalFeature optionalFeature);
}
