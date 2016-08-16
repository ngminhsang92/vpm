package domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Minh Sang on 8/14/2016.
 */

@Entity
public class Task {
    @Id
    @GeneratedValue
    private long id;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Beneficiary> beneficiaries;
    @ElementCollection
    private List<String> resources;
    @ElementCollection
    private List<byte[]> pictures;

    private double duration;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Beneficiary> getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(List<Beneficiary> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public List<byte[]> getPictures() {
        return pictures;
    }

    public void setPictures(List<byte[]> pictures) {
        this.pictures = pictures;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
