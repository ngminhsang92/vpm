package dao;

import domain.CrudRespository;
import domain.Service;

import java.util.List;

/**
 * Created by Minh Sang on 8/14/2016.
 */
public class ServiceDao implements CrudRespository<Service, Long> {
    public void create(Service entity) {

    }

    public void update(Service entity) {

    }

    public Service findOne(Long id) {
        return null;
    }

    public List<Service> findAll() {
        return null;
    }

    public boolean exist(Long id) {
        return false;
    }

    public long count() {
        return 0;
    }

    public void delete(Long id) {

    }
}
