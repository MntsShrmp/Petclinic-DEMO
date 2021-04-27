package org.springframework.data.repository;

public interface Repository<T, ID> {
    void listAllObjects() throws DataAccessException;
}
