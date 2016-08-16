package dao;

import domain.CrudRespository;
import domain.Task;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by Minh Sang on 8/14/2016.
 */
public class TaskDao implements CrudRespository<Task, Long> {

    private SessionFactory sf = HibernateUtil.getSessionFactory();

    public void create(Task entity) {
        sf.getCurrentSession().persist(entity);
    }

    public void update(Task entity) {
        sf.getCurrentSession().saveOrUpdate(entity);
    }

    public Task get(Long id) {
        return (Task) sf.getCurrentSession().get(Task.class, id);
    }

    public void delete(Task entity) {
        sf.getCurrentSession().delete(entity);
    }
}
