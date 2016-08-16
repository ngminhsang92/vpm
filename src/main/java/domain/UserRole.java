package domain;

import javax.persistence.*;
/**
 * Created by Minh Sang on 8/15/2016.
 */
@Entity
public class UserRole {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int role; // 0 is an Administrator, 1 is a Volunteer

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

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
