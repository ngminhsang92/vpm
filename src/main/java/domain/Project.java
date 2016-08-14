package domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Minh Sang on 8/14/2016.
 */

@Entity
public class Project {
    @Id
    @GeneratedValue
    private long id;
    private String description;

    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @OneToMany
    private List<Task> tasks;

    @ElementCollection
    private List<byte[]> pictures;
    @OneToOne
    private Location location;
}
