package org.springframework.boot.autoconfigure.cache;

public abstract interface JCacheManagerCustomizer {

    public abstract void customize(javax.cache.CacheManager cacheManager);
}