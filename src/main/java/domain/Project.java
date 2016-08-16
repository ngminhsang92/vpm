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
    @OneToMany(mappedBy = "project",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Task> tasks;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ElementCollection
    private List<byte[]> pictures;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Location location;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private UserRole createdBy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<byte[]> getPictures() {
        return pictures;
    }

    public void setPictures(List<byte[]> pictures) {
        this.pictures = pictures;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public UserRole getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserRole createdBy) {
        this.createdBy = createdBy;
    }
}
