package dao;

import domain.*;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;
import javax.persistence.PersistenceException;
import java.util.List;

/**
 * Created by Minh Sang on 8/14/2016.
 */
public class ProjectDao implements CrudRespository<Project, Long>{

    private SessionFactory sf = HibernateUtil.getSessionFactory();

    public void create(Project entity) {
        try {
            Transaction tx = sf.getCurrentSession().beginTransaction();
            sf.getCurrentSession().persist(entity);
            tx.commit();
        }catch (PersistenceException ex){
            sf.getCurrentSession().getTransaction().rollback();
            ex.printStackTrace();
        }
    }

    public void update(Project entity) {
        try {
            sf.getCurrentSession().saveOrUpdate(entity);
        }catch (PersistenceException ex){
            sf.getCurrentSession().getTransaction().rollback();
            ex.printStackTrace();
        }
    }

    public Project get(Long id) {
        return (Project) sf.getCurrentSession().get(Project.class, id);
    }

    public void delete(Project entity) {
        try {
            sf.getCurrentSession().delete(entity);
        }catch (PersistenceException ex){
            sf.getCurrentSession().getTransaction().rollback();
            ex.printStackTrace();
        }
    }

    public List<Project> getAll() {
        return sf.getCurrentSession().createQuery("From Project").list();
    }

    public List<Project> getBy(Query query){
        return query.list();
    }

    public List<Project> getByStatus(Status status){
        Query query = sf.getCurrentSession().createQuery("SELECT p FROM Project p WHERE p.status = :status");
        query.setParameter("status", status.name());
        return getBy(query);
    }

    public List<Project> getByResource(String resourceType){
        Query query = sf.getCurrentSession().createQuery("SELECT DISTINCT p FROM Project p JOIN p.tasks t " +
                                                            "WHERE t.resources= :resourceType");
        query.setParameter("resourceType", resourceType);
        return getBy(query);
    }

    public List<Project> getByLocation(String location){
        Query query = sf.getCurrentSession().createQuery("SELECT p FROM Project p " +
                            "WHERE p.location.city = :city or p.location.state = :state or p.location.zipCode = :zipCode");
        query.setParameter("city", location);
        query.setParameter("state", location);
        query.setParameter("zipCode", location);
        return getBy(query);
    }

    public List<Project> getByKeywords(String keywords){
        Query query = sf.getCurrentSession().createQuery("SELECT p FROM Project p " +
                "WHERE p.description LIKE %:keywords%");
        query.setParameter("keywords", keywords);
        return getBy(query);
    }
}
