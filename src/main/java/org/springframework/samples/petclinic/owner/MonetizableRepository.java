package org.springframework.samples.petclinic.owner;

import java.util.Collection;
import org.springframework.data.repository.Repository;

public interface MonetizableRepository<T,ID> extends Repository<T, ID> {
    boolean isMonetizable();

    boolean isExpired();

    void listAllObjects() throws DataAccessException;
}