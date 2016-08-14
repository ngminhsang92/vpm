package dao;

import domain.CrudRespository;
import domain.Task;

import java.util.List;

/**
 * Created by Minh Sang on 8/14/2016.
 */
public class TaskDao implements CrudRespository<Task, Long> {
    public void create(Task entity) {

    }

    public void update(Task entity) {

    }

    public Task findOne(Long id) {
        return null;
    }

    public List<Task> findAll() {
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
