package domain;

import javax.persistence.*;

/**
 * Created by Minh Sang on 8/14/2016.
 */
@Entity
public class ResourceType {
    @Id
    @GeneratedValue
    private long id;
    private String requiredSkill;
}
