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
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Task task;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private UserRole owner;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public UserRole getOwner() {
        return owner;
    }

    public void setOwner(UserRole owner) {
        this.owner = owner;
    }
}
