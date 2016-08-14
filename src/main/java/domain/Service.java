package domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Minh Sang on 8/14/2016.
 */
@Entity
public class Service {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    @OneToMany
    private List<Task> tasks;
}
