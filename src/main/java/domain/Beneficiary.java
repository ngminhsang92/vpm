package domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Minh Sang on 8/14/2016.
 */
@Entity
public class Beneficiary {
    @Id
    @GeneratedValue
    private long id;

    @ElementCollection
    private List<byte[]> pictures;
    private String description;
    private String name;
}
