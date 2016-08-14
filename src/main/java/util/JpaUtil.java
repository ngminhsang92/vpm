package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Minh Sang on 8/14/2016.
 */
public class JpaUtil {
    public static final EntityManagerFactory emf;
    static {
        try {
            emf = Persistence.createEntityManagerFactory("cs544");
        }catch (Throwable ex){
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}
