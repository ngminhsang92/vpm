package domain;

import java.util.List;

/**
 * Created by Minh Sang on 8/14/2016.
 */
public interface CrudRespository<E, I> {
    void create(E entity);

    void update(E entity);

    E get(I id);

    void delete(E entity);
}
