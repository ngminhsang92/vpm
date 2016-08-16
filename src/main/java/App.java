import domain.Location;
import domain.Project;
import domain.Status;
import domain.UserRole;
import org.hibernate.SessionFactory;
import service.ProjectService;
import util.HibernateUtil;

import java.util.Date;
import java.util.Locale;

/**
 * Created by Minh Sang on 8/16/2016.
 */
public class App {
    public static void main(String[] argv){
        ProjectService projectService = new ProjectService();
        Location location = new Location();
        location.setCity("Fairfield");
        location.setState("Iowa");
        location.setZipCode("52557");
        UserRole role = new UserRole();
        role.setName("abc");
        role.setRole(0);
        projectService.addNewProject("aadsf", new Date(), new Date(), null, Status.NEW, null, location, role);
        System.out.println("Hello!");

    }
}
