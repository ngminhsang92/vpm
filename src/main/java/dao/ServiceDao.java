package dao;

import domain.CrudRespository;
import domain.Service;
import domain.Task;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import java.util.List;

/**
 * Created by Minh Sang on 8/14/2016.
 */
public class ServiceDao implements CrudRespository<Service, Long> {
    private SessionFactory sf = HibernateUtil.getSessionFactory();

    public void create(Service entity) {
        sf.getCurrentSession().persist(entity);
    }

    public void update(Service entity) {
        sf.getCurrentSession().saveOrUpdate(entity);
    }

    public Service get(Long id) {
        return (Service) sf.getCurrentSession().get(Service.class, id);
    }

    public void delete(Service entity) {
        sf.getCurrentSession().delete(entity);
    }

    public List<Task> getTasks(long ownerId){
        Query query = sf.getCurrentSession().createQuery("SELECT s.task FROM Service s " +
                                                        "WHERE s.owner = :ownerId order by s.task.duration");
        query.setParameter("ownerId", ownerId);
        return query.list();
    }
}
