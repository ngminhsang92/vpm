package domain;

import javax.persistence.*;

/**
 * Created by Minh Sang on 8/14/2016.
 */
@Entity
public class Location {
    @Id
    @GeneratedValue
    private long id;
    private String city;
    private String state;
    private String zipCode;

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
